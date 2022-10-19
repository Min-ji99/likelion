package week3.day1006.file;

import java.io.File;
import java.io.IOException;

public class ReadFileMain {
    public void printFile(){
        File dir = new File("./a_file.txt");
        File files[] = dir.listFiles(); //현재 디렉토리의 파일 list
        for(File file : files){ //현재 디렉토리 파일 목록 출력
            System.out.println(file);
        }
    }
    public static void main(String[] args) throws IOException {

        ReadFile readFile = new ReadFile("./a_file.txt");

        System.out.println("한글자 : " +readFile.readChar()); //한글자
        System.out.println("두글자 : "+readFile.read2Chars());
        System.out.println("n글자 : "+readFile.readNChars(5));
        System.out.println("한 줄 : "+readFile.readLine());
        System.out.println("n 줄 : " +readFile.readNLine(3));
    }
}
