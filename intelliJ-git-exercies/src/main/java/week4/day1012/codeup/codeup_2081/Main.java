//1차원 배열에서 최댓값 구하기
//반복문 비교 -> 메모리 : 14344 시간 : 120
//List max 함수 사용 -> 메모리 : 14416 시간 : 117
package week4.day1012.codeup.codeup_2081;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int max = 0;
        int max_idx = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                max_idx = i + 1;
            }
        }
        /*
        //List 사용
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<9; i++){
            arr.add(sc.nextInt());
        }
        int max=Collections.max(arr);
        int max_idx=arr.indexOf(max)+1;
        */
        System.out.println(max);
        System.out.println(max_idx);

    }
}
