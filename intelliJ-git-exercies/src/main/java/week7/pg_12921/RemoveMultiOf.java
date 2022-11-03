package week7.pg_12921;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMultiOf {
    public int solution(int num){
        int n=50;
        int[] nums=new int[n-1];
        boolean[] checks=new boolean[nums.length];

        Arrays.fill(checks, true);

        for(int i=0; i<nums.length; i++) nums[i]=i+2;
        /*
        //list 이용한 에라토스테네스의 체
        List<Integer> numbers=new ArrayList<>();
        //2부터 num까지 숫자가 들어있는 List 만들기
        for(int i=2; i<=num; i++){
            numbers.add(i);
        }
        //리스트에서 자기 자신을 제외한 모든 배수 지우기(num의 제곱근까지)
        for(int i=2; i*i<=num; i++) {
            for (int j =2; j * i <= num; j++) {
                if (numbers.indexOf(i * j) > -1) {
                    numbers.remove(numbers.indexOf(i * j));
                }
            }
        }
        for(Integer number:numbers){
            System.out.println(number);
        }
        //소수 개수 출력
        return numbers.size();
         */
    }
}
