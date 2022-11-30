package week11.day1130;

public class PG_12916 {
    public static boolean solution(String s) {
        s=s.toLowerCase();
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p') count++;
            if(s.charAt(i)=='y') count--;
        }

        return count==0 ? true : false;
    }

    public static void main(String[] args) {
        solution("pPoooyY");
    }
}
