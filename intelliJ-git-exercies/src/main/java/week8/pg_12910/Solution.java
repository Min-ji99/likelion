package week8.pg_12910;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Solution {
    public ArrayList<Integer> findElement(int[] arr, int divisor){
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }
        if (result.isEmpty()) {
            result.add(-1);
        }
        return result;
    }
    public int[] makeAnswer(ArrayList<Integer> result){
        int[] answer=new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i]=result.get(i);
        }
        return answer;
    }
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> result = findElement(arr, divisor);

        answer = makeAnswer(result);
        Arrays.sort(answer);
        return answer;
    }
}
