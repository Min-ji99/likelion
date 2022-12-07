package week12.day1207;

import java.util.PriorityQueue;

public class PG_42626 {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> scovilles = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            scovilles.add(scoville[i]);
        }
        while(scovilles.peek()<K){
            if(scovilles.size()<2){
                return -1;
            }
            int first=scovilles.poll();
            int second=scovilles.poll();
            scovilles.add(first+second*2);
            answer+=1;
        }
        return answer;
    }

    public static void main(String[] args) {
        PG_42626 pg_42626=new PG_42626();
        System.out.println(pg_42626.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}
