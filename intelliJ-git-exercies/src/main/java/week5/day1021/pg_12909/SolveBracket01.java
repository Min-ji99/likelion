package week5.day1021.pg_12909;
import java.util.Stack;

public class SolveBracket01 {
    boolean solution(String s){
        while(s.indexOf("()")>=0){
            s=s.replace("()", "");
        }

        return s.length()==0;
    }

}
