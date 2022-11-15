package week9.day1115;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr=new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        int pivot=arr[arr.length/2];
        List<Integer> left=new ArrayList<>();
        List<Integer> right=new ArrayList<>();

        for(int num: arr){
            if(num<=pivot){
                left.add(num);
            }else{
                right.add(num);
            }
        }
    }
}
