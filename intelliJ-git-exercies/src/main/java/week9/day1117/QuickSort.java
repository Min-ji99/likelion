package week9.day1117;

import java.util.Arrays;

public class QuickSort {
    public int[] sort(int[] arr, int startIdx, int endIdx) {
        int pivot = arr[(startIdx+endIdx) / 2];
        int leftIdx = startIdx;
        int rightIdx = endIdx;

        while (true) {
            while (arr[leftIdx] < pivot) leftIdx += 1;
            while (arr[rightIdx] > pivot) rightIdx -= 1;
            if(leftIdx>rightIdx) break;
            swap(arr, leftIdx, rightIdx);
            leftIdx += 1;
            rightIdx -= 1;

            System.out.printf("4:%d 7:%d\n", arr[4], arr[7]); // 25, 40
            System.out.printf("leftIdx:%d rightIdx:%d\n", leftIdx, rightIdx); // 5, 6
            System.out.println(Arrays.toString(arr));
        }
        if(startIdx < rightIdx) sort(arr, startIdx, rightIdx);
        if(leftIdx < endIdx) sort(arr, leftIdx, endIdx);
        return arr;
    }
    public void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        QuickSort quickSort=new QuickSort();
        quickSort.sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
