package week7.pg_12921;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMultiOf {
    public int solution(int num){
        int answer=0;
        List<Integer> numbers=new ArrayList<>();
        //1.2부터 num까지 숫자가 들어있는 List 만들기
        for(int i=2; i<=num; i++){
            numbers.add(i);
        }
        //2. 리스트에서 2를 제외한 모든 2의 배수 제거하기
        for(int i=2; i*2<=num; i++){
            if(numbers.indexOf(2*i)>-1) {
                numbers.remove(numbers.indexOf(2*i));
            }
        }
        for(Integer number:numbers){
            System.out.println(number);
        }
        return answer;
    }
}
