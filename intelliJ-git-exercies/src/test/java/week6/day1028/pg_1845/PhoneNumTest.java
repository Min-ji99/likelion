package week6.day1028.pg_1845;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumTest {
    PhoneNum phoneNum;

    int[] num1;
    int[] num2;
    int[] num3;
    @BeforeEach
    void setup(){
        phoneNum=new PhoneNum();
        num1=new int[]{3,1,2,3};
        num2=new int[]{3,3,3,2,2,4};
        num3=new int[]{3,3,3,2,2,2};
    }
    @Test
    void solutionTest(){
        assertEquals(2, phoneNum.solution(num1));
        assertEquals(3, phoneNum.solution(num2));
        assertEquals(2, phoneNum.solution(num3));
    }
}