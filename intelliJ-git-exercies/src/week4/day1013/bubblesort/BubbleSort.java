package week4.day1013.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public void sorting(int[] arr){
        int tmp=0;
        for(int i=0; i<arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
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
        BubbleSort bubbleSort = new BubbleSort();
        int arr[]=new int[]{7, 2, 3, 9, 28, 11};
        bubbleSort.sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
