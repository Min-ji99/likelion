package week8.pg_12906;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PG_12906Test {
    PG_12906 pg_12906;
    int[] arr1;
    int[] arr2;
    int[] result1;
    int[] result2;
    @BeforeEach
    void setup(){
        pg_12906=new PG_12906();
        arr1=new int[]{1,1,3,3,0,1,1};
        arr2=new int[]{4,4,4,3,3};
        result1=new int[]{1,3,0,1};
        result2=new int[]{4,3};
    }
    @Test
    void solutionTest(){
        assertArrayEquals(result1, pg_12906.solution(arr1));
        assertArrayEquals(result2, pg_12906.solution(arr2));
    }
}