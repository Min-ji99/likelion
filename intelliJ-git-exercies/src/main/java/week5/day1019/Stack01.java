package week5.day1019;

public class Stack01 {
    private int[] arr=new int[10000];
    private int pointer=0;
    public Stack01(){ }
    public Stack01(int size){
        this.arr=new int[size];
    }
    public void push(int value){
        arr[pointer++]=value;
    }
    public int[] getArr(){
        return arr;
    }
    public int pop(){
        int value=arr[pointer-1];
        pointer--;
        return value;
    }
}
