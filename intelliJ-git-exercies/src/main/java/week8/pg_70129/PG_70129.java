package week8.pg_70129;

public class PG_70129 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt=0;
        int zeroCnt=0;
        while(!s.equals("1")){
            zeroCnt+=s.length()-s.replace("0", "").length();
            s=s.replace("0", ""); //0제거
            s=Integer.toBinaryString(s.length()); //문자열 길이를 2진수로 변환
            cnt+=1;
        }
        answer[0]=cnt;
        answer[1]=zeroCnt;
        return answer;
    }
}
