package week8.pg_12906;

import java.util.ArrayList;

public class PG_12906 {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrList=new ArrayList<>();

        int value=-1;
        for(int i=0; i<arr.length; i++){
            if(value!=arr[i]){
                arrList.add(arr[i]);
                value=arr[i];
            }
        }
        int[] answer=new int[arrList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=arrList.get(i);
        }
        return answer;
    }
}
