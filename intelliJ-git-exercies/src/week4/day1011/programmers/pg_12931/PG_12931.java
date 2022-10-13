package week4.day1011.programmers.pg_12931;

public class PG_12931 {
    public int solution(int n) {
        int answer = 0;

        while(n>0){
            answer+=n%10;
            n=n/10;
        }
        return answer;
    }
    public static void main(String[] args) {
        PG_12931 pg = new PG_12931();

        int result1=pg.solution(1234);

        if(result1==10){
            System.out.println("테스트를 통과했습니다");
        }else{
            System.out.printf("테스트 실패 result: %d\n", result1);
        }
    }

}

