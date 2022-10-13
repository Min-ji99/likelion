package week3.day1007.population;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFile<T> {
    private String filename;
    public ReadFile(String filename) {
        this.filename=filename;
    }
    public void readByChar() throws IOException {
        FileReader fileReader = new FileReader(this.filename); //파일 읽어오기
        BufferedReader br = new BufferedReader(fileReader); //버퍼를 활용해서 파일 읽기

        String fileContents ="";
        while(fileContents.length()<1_000_000){
            char c = (char)fileReader.read();
            fileContents+=c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }

    //한줄씩 parsing
    public List<PopulationMove> readByLine() throws IOException{
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(this.filename));
        String str;
        while((str=br.readLine())!=null){
            pml.add(parse(str)); //입력받은 한 줄 parsing
        }
        br.close();
        return pml;
    }

    public void readByLine2() throws IOException {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(this.filename), StandardCharsets.UTF_8)) {
            String line;
            while((line=br.readLine())!=null) {
                parse(line); //입력받은 한 줄 parsing
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    //파일을 한번에 읽고 parsing
    public List<PopulationMove> readLineAll() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
        List<PopulationMove> populationMoves = new ArrayList<>();
        for(String line : lines){
            populationMoves.add(parse(line));
        }
        return populationMoves;
    }

    //,로 파싱 후 PopulationMove 객체 생성
    public PopulationMove parse(String data) {
        String[] populationMoveDatas = data.split(",");
        return new PopulationMove(Integer.valueOf(populationMoveDatas[0]), Integer.valueOf(populationMoveDatas[1]));
    }
}
