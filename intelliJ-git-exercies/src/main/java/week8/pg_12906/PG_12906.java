package week8.pg_12906;

import java.util.ArrayList;
import java.util.Stack;
/*
효율성
solution
테스트 1 〉	통과 (22.09ms, 115MB)
테스트 2 〉	통과 (23.42ms, 115MB)
테스트 3 〉	통과 (23.45ms, 115MB)
테스트 4 〉	통과 (23.95ms, 111MB)

solution2
테스트 1 〉	통과 (37.94ms, 116MB)
테스트 2 〉	통과 (37.51ms, 111MB)
테스트 3 〉	통과 (40.80ms, 113MB)
테스트 4 〉	통과 (39.20ms, 111MB)
 */
public class PG_12906 {
    //스택 안쓰고
    public int[] solution(int[] arr) {
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
    //스택 사용
    public int[] solution2(int[] arr){
        Stack<Integer> stack=new Stack<>();
        stack.add(arr[0]);
        for(int i=0; i<arr.length; i++){
            if(stack.peek()!=arr[i]){
                stack.add(arr[i]);
            }
        }
        int[] answer=new int[stack.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=stack.get(i);
        }
        return answer;
    }
}
