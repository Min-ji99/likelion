package week8.pg_17681;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PG_17681Test {
    PG_17681 pg_17681;
    int n;
    int[] arr1;
    int[] arr2;
    String[] result;

    @BeforeEach
    void setup(){
        pg_17681=new PG_17681();
        n=5;
        arr1=new int[]{9, 20, 28, 18, 11};
        arr2=new int[]{30, 1, 21, 17, 28};
        result=new String[]{"#####","# # #", "### #", "# ##", "#####"};
    }

    @Test
    void solutionTest(){
        assertArrayEquals(result, pg_17681.solution(n, arr1, arr2));
    }
    @Test
    void toBinaryStringTest(){
        assertEquals("11111", pg_17681.toBinaryString(31));
        assertEquals("1010", pg_17681.toBinaryString(10));
    }
}