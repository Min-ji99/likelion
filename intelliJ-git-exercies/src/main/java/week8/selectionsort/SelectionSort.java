package week8.selectionsort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr=new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int idx=0;
        for(int i=1; i<arr.length; i++){
            if(arr[idx]>arr[i]) idx=i;
        }
    }
}
