package week5.day1020.pg_12922;

public class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i=1; i<=n; i++){
            answer+=(i%2==1)?"수":"박";
        }
        return answer;
    }
}
