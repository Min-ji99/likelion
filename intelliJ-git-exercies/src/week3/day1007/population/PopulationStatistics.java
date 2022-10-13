package week3.day1007.population;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {

    public static void main(String[] args) throws IOException {
        String address="./from_to.txt";
        ReadFile readFile = new ReadFile(address);
        MoveCount moveCount=new MoveCount();
        CreateFile createFile = new CreateFile();
        HeatMap heatMap=new HeatMap();
        List<String> cntResult=new ArrayList<>();

        List<PopulationMove> populationMoves = readFile.readByLine();


        moveCount.setMoveCntMap(populationMoves);
        Map<String, Integer> moveCntMap=moveCount.getMoveCntMap();
        Map<String, Integer> heatMapIdx= heatMap.setheatMapIdx();

        for(String key:moveCntMap.keySet()){
            String[] fromto=key.split(",");
            String s = String.format("[%s, %s, %d],\n", heatMapIdx.get(fromto[0]), heatMapIdx.get(fromto[1]), moveCntMap.get(key));
            cntResult.add(s);
        }
        createFile.write(cntResult, "for_heatmap.txt");
    }
}
