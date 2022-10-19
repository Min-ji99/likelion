package week4.day1014.algorithm.insertion_sort;

import java.util.Arrays;

public class InsertionSort01 {
    public void sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j - 1, j);
                }
            }
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
