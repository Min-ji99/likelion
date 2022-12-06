package week12.day1206;

import java.util.Arrays;

public class HeapSort {
    public static int[] makeHeap(int[] arr, int idx, int arrSize){
        int left=idx*2+1;
        int right=idx*2+2;
        int great=idx;
        if(left<arrSize && arr[great]<arr[left]){
            great=left;
        }
        if(right<arrSize && arr[great]<arr[right]){
            great=right;
        }
        if(idx!=great){
            swap(arr, great, idx);
            makeHeap(arr, great, arrSize);
        }
        return arr;
    }
    public static void swap(int[] arr, int a, int b){
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};
        arr = new int[]{5, 8, 4, 7, 3, 2, 9, 6, 7};
        for (int j = arr.length/2-1; j >= 0 ; j--) {
            arr = makeHeap(arr, j, arr.length);
            System.out.println(Arrays.toString(arr));
        }
        for(int i=arr.length-1; i>=0; i--){
            swap(arr, 0, i);
            arr=makeHeap(arr, 0, i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
