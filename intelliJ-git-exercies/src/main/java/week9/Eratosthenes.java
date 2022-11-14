package week9;

import java.util.Arrays;

public class Eratosthenes {
    public static void main(String[] args) {
        int[] arr=new int[51];
        for(int i=0; i<=50; i++){
            arr[i]=i;
        }
        arr[1]=0;
        int multipleOf=2;
        for(int i=multipleOf*2; i<=50; i+=multipleOf){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
