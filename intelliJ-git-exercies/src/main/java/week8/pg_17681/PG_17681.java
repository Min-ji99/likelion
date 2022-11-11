package week8.pg_17681;

import java.util.Arrays;

/*
1. 전체 지도 구하기
   비트 연산자 or로 계산
2. 연산 결과를 이진수로 변경
    1이면 # 아니면 공백
 */
public class PG_17681 {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = {};
            String[] maps=new String[arr1.length];

            for(int i=0; i<arr1.length; i++){
                maps[i]=Integer.toBinaryString(arr1[i]|arr2[i]);
            }


            return answer;
        }
}
