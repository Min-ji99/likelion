package week12.day1206;

import java.util.Arrays;

public class HeapSort {
    public static int[] makeHeap(int[] arr, int idx){
        int left=idx*2+1;
        int right=idx*2+2;
        int parent=idx;
        if(left<arr.length && arr[parent]<arr[left]){
            parent=left;
        }
        if(right<arr.length && arr[parent]<arr[right]){
            parent=right;
        }
        if(idx!=parent){
            swap(arr, parent, idx);
            makeHeap(arr, parent);
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
        for (int j = (arr.length-2)/2; j >= 0 ; j--) {
            arr = makeHeap(arr, j);
            System.out.println(Arrays.toString(arr));
        }
    }
}
