package week9.day1116;

import java.util.Arrays;

public class QuickSort {
    public void sorting(int[] arr, int left, int right){
        if(left>=right) return;

        int pivot=partition(arr, left, right);

        sorting(arr, left, pivot);
        sorting(arr, pivot+1, right);
    }
    public int partition(int[] arr, int leftIdx, int rightIdx){
        int pivot = arr[(leftIdx+rightIdx) / 2];
        leftIdx-=1;
        rightIdx+=1;
        while(true) {
            do{
                leftIdx++;
            }while(arr[leftIdx]<pivot);

            do{
                rightIdx--;
            }while(arr[rightIdx]>pivot && leftIdx<rightIdx);

            if (leftIdx>=rightIdx){
                return rightIdx;
            }
            swap(arr, leftIdx, rightIdx);
        }
    }
    public void swap(int[] arr, int leftIdx, int rightIdx){
        int tmp=arr[leftIdx];
        arr[leftIdx]=arr[rightIdx];
        arr[rightIdx]=tmp;
    }
    public static void main(String[] args) {
        QuickSort quickSort=new QuickSort();
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};

        quickSort.sorting(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
