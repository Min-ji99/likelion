package week8.pg_42586;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PG_42586Test {
    PG_42586 pg_42586;
    int[] progresses1;
    int[] speeds1;
    int[] result1;

    int[] progresses2;
    int[] speeds2;
    int[] result2;

    @BeforeEach
    void setup(){
        pg_42586=new PG_42586();
        progresses1=new int[]{93, 30, 55};
        speeds1=new int[]{1, 30, 5};
        result1=new int[]{2, 1};
    }
    @Test
    void solutionTest(){
        assertArrayEquals(result1, pg_42586.solution(progresses1, speeds1));
    }
}