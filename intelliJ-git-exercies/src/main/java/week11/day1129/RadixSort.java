package week11.day1129;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 5, 9, 1, 0};
        int[] radixArr=new int[10];

        for(int i : arr){
            radixArr[i]=i;
        }
        for(int i=0; i<radixArr.length; i++){
            if(radixArr[i]!=0) System.out.println(radixArr[i]);
        }
    }
}
