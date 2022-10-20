package week5.day1020;

public class Stack02 {
    private Integer[] arr;
    private int top=0;
    public Stack02(){ arr=new Integer[10000]; }
    public Stack02(int size){
        this.arr=new Integer[size];
    }
    public void push(int value){
        arr[top++]=value;
    }
    public Integer[] getArr(){
        return arr;
    }

    public int pop(){
        int value=arr[top-1];
        top--;
        return value;
    }
}
