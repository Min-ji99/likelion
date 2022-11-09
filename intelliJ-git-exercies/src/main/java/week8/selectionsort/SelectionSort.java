package week8.selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public void sorting(int[] arr){
        for(int i=0; i<arr.length-1; i++) {
            int idx=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[idx] > arr[j]) idx = j;
            }
            swap(arr, idx, i);
        }
    }
    public void swap(int[] arr, int i, int j){
        int tmp=arr[j];
        arr[j]=arr[i];
        arr[i]=tmp;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        SelectionSort selectionSort=new SelectionSort();
        selectionSort.sorting(arr);

        System.out.println(Arrays.toString(arr));
    }
}
