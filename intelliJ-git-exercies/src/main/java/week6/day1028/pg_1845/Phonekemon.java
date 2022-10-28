package week6.day1028.pg_1845;
/*
1. 폰켓몬 번호별로 몇마리 있는지 체크를 한다
2. 가장 많은 폰켓몬을 선택하는 방법 중 폰켓몬의 종류를 찾아 반환을 한다.
    1. 폰켓몬의 종류를 cnt한다.
    2. 폰켓몬의 종류가 N/2보다 많이 가져갈 수 없기 때문에 check를 한다.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonekemon {
    //HashMap 이용
    public int solution1(int[] nums) {
        int answer = 0;
        //HashMap 이용
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
    //HashSet이용
    public int solution2(int[] nums){
        Set<Integer> typeSet=new HashSet<>();
        for(int num : nums){
            typeSet.add(num);
        }
        if(typeSet.size()>nums.length/2){
            return nums.length/2;
        }else{
            return typeSet.size();
        }
    }
}
