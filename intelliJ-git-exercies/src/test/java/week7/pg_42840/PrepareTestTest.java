package week7.pg_42840;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrepareTestTest {
    PrepareTest prepareTest;
    int[] answers1;
    int[] answers2;

    int[] result1;
    int[] result2;
    @BeforeEach
    void setup(){
        prepareTest=new PrepareTest();
        answers1=new int[]{1,2,3,4,5};
        answers2=new int[]{1,3,2,4,2};
        result1=new int[]{1};
        result2=new int[]{1, 2, 3};
    }
    @Test
    void case1(){
        //assertArrayEquals : 배열의 값 비교
        assertArrayEquals(result2, prepareTest.solution(answers2));
    }
    @Test
    void case2(){
        assertArrayEquals(result2, prepareTest.solution(answers2));
    }
}