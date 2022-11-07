package week8.pg_12947;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HarshadNumberTest {
    HarshadNumber harshadNumber;
    int arr1;
    int arr2;
    int arr3;
    int arr4;

    @BeforeEach
    void setup(){
        harshadNumber=new HarshadNumber();
        arr1=10;
        arr2=12;
        arr3=11;
        arr4=13;
    }
    @Test
    void sumOfDigitsTest(){
        assertEquals(1, harshadNumber.sumOfDigits(arr1));
        assertEquals(3, harshadNumber.sumOfDigits(arr2));
        assertEquals(2, harshadNumber.sumOfDigits(arr3));
        assertEquals(4, harshadNumber.sumOfDigits(arr4));
    }
    @Test
    void solutionTest(){
        assertTrue(harshadNumber.solution(arr1));
        assertTrue(harshadNumber.solution(arr2));
        assertFalse(harshadNumber.solution(arr3));
        assertFalse(harshadNumber.solution(arr4));
    }
}