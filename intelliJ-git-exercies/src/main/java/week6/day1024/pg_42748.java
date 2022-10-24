package week6.day1024;

import java.util.Arrays;

public class pg_42748 {
    public static int[] solution(int[] array, int[][] commands) {
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
        int[] array={1, 5, 2, 6, 3, 7, 4};
        int[][] commands={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer=solution(array, commands);
        System.out.println(Arrays.toString(answer));
    }
}
