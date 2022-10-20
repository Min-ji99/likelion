package week5.day1020;

import java.util.EmptyStackException;

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
        //비어있는 stack에서 pop을 하는 경우 예외처리
        if(isEmpty()) {throw new EmptyStackException();}
        return arr[--top];
    }

    public boolean isEmpty() {
        if(top==0) {return true;}
        return false;
    }

    public int peek() {
        if(isEmpty()){throw new EmptyStackException();}
        return arr[top-1];
    }
}
