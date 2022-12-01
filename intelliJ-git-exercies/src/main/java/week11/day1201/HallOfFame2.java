package week11.day1201;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HallOfFame2 {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();

        for(int i=0; i<score.length; i++){
            priorityQueue.add(score[i]);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
            answer[i]=priorityQueue.peek();
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] score={10, 100, 20, 150, 1, 100, 200};
        int k=3;
        System.out.println(Arrays.toString(solution(k, score)));
    }
}
