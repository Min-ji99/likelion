package week6.day1028.pg_1845;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonekemonTest {
    Phonekemon phonekemon;

    int[] num1;
    int[] num2;
    int[] num3;
    @BeforeEach
    void setup(){
        phonekemon =new Phonekemon();
        num1=new int[]{3,1,2,3};
        num2=new int[]{3,3,3,2,2,4};
        num3=new int[]{3,3,3,2,2,2};
    }
    @Test
    void solution1Test(){
        assertEquals(2, phonekemon.solution1(num1));
        assertEquals(3, phonekemon.solution1(num2));
        assertEquals(2, phonekemon.solution1(num3));
    }

    @Test
    void solution2Test(){
        assertEquals(2, phonekemon.solution2(num1));
        assertEquals(3, phonekemon.solution2(num2));
        assertEquals(2, phonekemon.solution2(num3));
    }
}