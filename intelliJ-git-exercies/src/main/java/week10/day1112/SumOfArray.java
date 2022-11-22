package week10.day1112;

public class SumOfArray {
    public int sum(int[] arr, int i){
        if(i<0) return 0;
        return sum(arr, i-1)+arr[i];
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1, 3, 5, 7, 9};
        SumOfArray sumOfArray=new SumOfArray();
        System.out.println(sumOfArray.sum(arr, arr.length-1));
    }
}
