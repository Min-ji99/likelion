package week9.day1116;

import java.util.Arrays;

public class QuickSort {
    public int partition(int[] arr, int leftIdx, int rightIdx){
        int pivot = arr[(leftIdx+rightIdx) / 2];
        leftIdx-=1;
        rightIdx+=1;

        while(true) {
            while (arr[leftIdx] < pivot) {
                leftIdx++;
            }
            while (arr[rightIdx] > pivot && leftIdx<=rightIdx) {
                rightIdx--;
            }
            if (leftIdx <= rightIdx) {
                swap(arr, leftIdx, rightIdx);
            }else{
                return rightIdx;
            }
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
        int pivot = arr[(arr.length) / 2];
        int leftIdx=0;
        int rightIdx=arr.length-1;

        while (arr[leftIdx] < pivot) {
            leftIdx++;
        }
        while (arr[rightIdx] > pivot) {
            rightIdx--;
        }
        if (leftIdx <= rightIdx) {
            quickSort.swap(arr, leftIdx, rightIdx);
            leftIdx++;
            rightIdx--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
