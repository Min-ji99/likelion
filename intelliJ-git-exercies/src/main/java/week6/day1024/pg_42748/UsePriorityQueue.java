package week6.day1024.pg_42748;

import java.util.Arrays;
import java.util.PriorityQueue;

public class UsePriorityQueue {
    public int getMaxNum(int[] arr, int[] command){
        int result=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=command[0]-1; i<command[1]; i++){
            pq.add(arr[i]);
        }
        for(int i=0; i<command[2]; i++){
            result=pq.poll();
        }
        return result;
    }
    public int[] solution(int[] array, int[][] commands) {
        int[] answer=new int[commands.length];
        for(int i=0; i<commands.length; i++){
            answer[i]=getMaxNum(array, commands[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        UsePriorityQueue usePriorityQueue=new UsePriorityQueue();
        int[] array={1, 5, 2, 6, 3, 7, 4};
        int[][] commands={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer=usePriorityQueue.solution(array, commands);

        System.out.println(Arrays.toString(answer));
    }
}
