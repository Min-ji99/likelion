package week6.day1028.pg_1845;

import java.util.HashMap;
import java.util.Map;

public class PhoneNum {
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
}
