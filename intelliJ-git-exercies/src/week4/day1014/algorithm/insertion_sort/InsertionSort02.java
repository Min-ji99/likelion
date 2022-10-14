//재귀로 구현
package week4.day1014.algorithm.insertion_sort;

import java.util.Arrays;

public class InsertionSort02 {
    public void sort(int[] arr, int i){
        if(i==arr.length) return;

        for(int j=i; j>0; j--){
            if(arr[j]<arr[j-1]){
                swap(arr, j-1, j);
            }
        }
        sort(arr, i+1);
    }
    public void swap(int[] arr, int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public static void main(String[] args) {
        int[] arr={8, 5, 6, 2, 4};
        InsertionSort02 insertionSort = new InsertionSort02();
        insertionSort.sort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}
