package week3.day1007.population;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoveCount {
    Map<String, Integer> moveCntMap=new HashMap<>();

    public void setMoveCntMap(List<PopulationMove> populationMoves){
        for(PopulationMove populationMove : populationMoves){
            String key=populationMove.getFromSido()+","+populationMove.getToSido();
            if(moveCntMap.get(key)==null){
                moveCntMap.put(key, 1);
            }else{
                moveCntMap.put(key, moveCntMap.get(key)+1);
            }
        }
    }
    /* key 값을 시도명으로 변경 ex)서울-경기
    public void keyToKorean(){
        for(String key : moveCntMap.keySet()){

        }
    }*/

    public Map<String, Integer> getMoveCntMap(){
        return moveCntMap;
    }
}
