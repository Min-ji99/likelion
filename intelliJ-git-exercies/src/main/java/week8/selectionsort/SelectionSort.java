package week8.selectionsort;

import java.util.Arrays;

interface StatementStrategy{
    boolean compare(int a, int b);
}
public class SelectionSort {
    public void sorting(int[] arr, StatementStrategy stmt){
        for(int i=0; i<arr.length-1; i++) {
            int idx=i;
            for (int j = i+1; j < arr.length; j++) {
                if (stmt.compare(arr[idx], arr[j])) idx = j;
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
        //내림차순 정렬
        selectionSort.sorting(arr, new StatementStrategy(){
            @Override
            public boolean compare(int idx, int a) {
                return idx<a;
            }
        } );
        System.out.println(Arrays.toString(arr));

        //오름차순 정렬
        selectionSort.sorting(arr, new StatementStrategy(){
            @Override
            public boolean compare(int idx, int a) {
                return idx>a;
            }
        } );
        System.out.println(Arrays.toString(arr));
    }
}
