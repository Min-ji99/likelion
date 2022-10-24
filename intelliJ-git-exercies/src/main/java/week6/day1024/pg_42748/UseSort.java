package week6.day1024.pg_42748;

import java.util.Arrays;

public class UseSort {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx=0;
        for(int[] command:commands){
            int[] sliceArr= Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(sliceArr);
            answer[idx++]=sliceArr[command[2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        UseSort useSort = new UseSort();
        int[] array={1, 5, 2, 6, 3, 7, 4};
        int[][] commands={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer=useSort.solution(array, commands);
        System.out.println(Arrays.toString(answer));
    }
}
