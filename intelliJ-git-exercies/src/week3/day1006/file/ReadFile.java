package week3.day1006.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    private String filename;
    public ReadFile(String filename){
        this.filename=filename;
    }
    public char readChar(){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(this.filename), StandardCharsets.UTF_8)) {
            return (char)br.read();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    public String read2Chars(){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(this.filename), StandardCharsets.UTF_8)) {
            String str="";
            for(int i=0; i<2; i++){
                str+=(char)br.read();
            }
            return str;
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    public String readNChars(int n){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(this.filename), StandardCharsets.UTF_8)) {
            String str="";
            for(int i=0; i<n; i++){
                str+=(char)br.read();
            }
            return str;
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    public String readLine() throws IOException{
        FileReader fileReader = new FileReader(this.filename); //파일 읽어오기

        try(BufferedReader br = new BufferedReader(
                fileReader,
                16 * 1024)) {
            String line="";
            while((line=br.readLine())!=null){
                return line;
            }
            return "";
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    public String readNLine(int n){
        try(BufferedReader br = new BufferedReader(
                new FileReader(this.filename),
                16 * 1024)) {
            String lines="";
            String str="";
            for(int i=0; i<n; i++){
                if((str=br.readLine())!=null){
                    lines+=str+"\n";
                }else{
                    break;
                }
            }
            return lines;
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
