package week4.day1014.algorithm.insertion_sort;

import java.util.Arrays;

public class InsertionSort01 {
    public void sort(int[] arr){
        int i=1;
        if(arr[i]<arr[i-1]){
            swap(arr, i, i-1);
        }
    }
    public void swap(int[] arr, int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public static void main(String[] args) {
        int[] arr={8, 5, 6, 2, 4};
        InsertionSort01 insertionSort = new InsertionSort01();
        insertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
