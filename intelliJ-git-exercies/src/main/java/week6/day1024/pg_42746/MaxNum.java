package week6.day1024.pg_42746;

import java.util.*;

public class MaxNum {
    public String solution(int[] numbers) {
        String answer="";
        List<String> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            list.add(Integer.toString(numbers[i]));
        }
        Collections.sort(list, (a, b)->{
            return -Integer.compare(Integer.parseInt(a + b), Integer.parseInt(b +a));
        });
        for(String s:list){
            answer+=s;
        }
        if (answer.charAt(0)=='0'){
            return "0";
        }
        //System.out.println(list);
        return answer;
    }

    public static void main(String[] args) {
        MaxNum maxNum=new MaxNum();
        int[] numbers1={6, 10, 2};
        System.out.println(maxNum.solution(numbers1));
        int[] numbers2={3, 30, 34, 5, 9};
        System.out.println(maxNum.solution(numbers2));
    }
}
