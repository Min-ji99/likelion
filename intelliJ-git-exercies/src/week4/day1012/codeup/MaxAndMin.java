package week4.day1012.codeup;

import java.lang.constant.Constable;

interface Compare{
    public boolean doSomething(int valueA, int valueB);
}
public class MaxAndMin {
    private int getMaxOrMin(int arr[], Compare compare){
        int targetValue=arr[0];
        for(int i=0; i<arr.length; i++){
            boolean isSth= compare.doSomething(arr[i], targetValue);
            if(isSth){
                targetValue=arr[i];
            }
        }
        return targetValue;
    }
    public int getMax(int arr[]){
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }
    public int getMin(int arr[]){
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA<valueB;
            }
        });
    }
    public static void main(String[] args) {
        int arr[]=new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        MaxAndMin maxAndMin = new MaxAndMin();
        System.out.println("min : "+maxAndMin.getMin(arr));
        System.out.println("max : "+maxAndMin.getMax(arr));
    }
}
