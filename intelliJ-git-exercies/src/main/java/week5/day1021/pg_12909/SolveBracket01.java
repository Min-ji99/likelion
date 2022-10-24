package week5.day1021.pg_12909;
import java.util.Stack;

public class SolveBracket01 {
    boolean solution(String s){
        while(s.indexOf("()")>=0){
            //s=s.replace("()", "");
            String[] splitted=s.split("\\(\\)");
            s=String.join("", splitted);
        }
        return s.length()==0;
    }

}
