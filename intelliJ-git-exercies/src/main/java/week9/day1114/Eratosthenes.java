package week9.day1114;

import java.util.Arrays;

public class Eratosthenes {
    public static void main(String[] args) {
        int[] arr=new int[51];
        for(int i=0; i<=50; i++){
            arr[i]=i;
        }
        arr[1]=0;
        for(int multipleOf=2; multipleOf*multipleOf<=50; multipleOf++) {
            for (int i = multipleOf * 2; i <= 50; i += multipleOf) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
