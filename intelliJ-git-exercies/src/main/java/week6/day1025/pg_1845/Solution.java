package week6.day1025.pg_1845;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> typeMap=new HashMap<>();
        for(int num : nums){ //폰켓몬 번호별로 몇마리 있는지 체크
            typeMap.put(num, typeMap.getOrDefault(num, 0)+1);
        }
        answer=typeMap.keySet().size(); //폰켓몬 종류 개수
        //가져갈 수 있는 n/2보다 폰켓몬 종류가 더 많은 때는 n/2개만 가져갈 수 있음
        if(nums.length/2<answer){
            return nums.length/2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] num1={3,1,2,3};
        int[] num2={3,3,3,2,2,4};
        int[] num3={3,3,3,2,2,2};

        if(solution.solution(num1)==2){
            System.out.println("1번 통과");
        }else{
            System.out.println("1번 실패");
        }
        if(solution.solution(num2)==3){
            System.out.println("2번 통과");
        }else{
            System.out.println("2번 실패");
        }
        if(solution.solution(num3)==2){
            System.out.println("3번 통과");
        }else{
            System.out.println("3번 실패");
        }
    }
}
