package week5.day1020;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {
    @BeforeEach
    void setUp() {
        //db에서 데이터 지우는 코드
        //db에 데이터 넣는 코드
        System.out.println("before each");
    }
    @Test
    @DisplayName("push가 잘되는지")
    void push() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr=st.getArr();
        assertEquals(20, arr[0]);
        assertEquals(10, arr[1]);
    }
    @Test
    void pushAndPop() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
        st.push(30);
        assertEquals(30, st.pop());
    }
    @Test
    void isEmpty(){
        Stack02 st = new Stack02();
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());
        //예외처리 테스트 케이스
        assertThrows(EmptyStackException.class, ()->{
                st.pop();
        });
    }
    @Test
    void realStack(){
        Stack<Integer> st = new Stack<>();
        //st.pop();
        st.peek();
    }
    @Test
    void peek(){
        Stack02 st = new Stack02();
        //stackd이 비었는데 peek
        assertThrows(EmptyStackException.class, ()->{
            st.peek();
        });
        st.push(10);
        int peek=st.peek();
        assertEquals(10, peek);
    }
}