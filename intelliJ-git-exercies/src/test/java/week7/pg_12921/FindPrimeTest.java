package week7.pg_12921;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPrimeTest {
    FindPrime findPrime;

    int n1;
    int n2;

    @BeforeEach
    void setup(){
        findPrime=new FindPrime();

        n1=10;
        n2=5;
    }
    @Test
    void case1(){
        assertEquals(4,findPrime.solution(n1));
    }
    @Test
    void case2(){
        assertEquals(3,findPrime.solution(n2));
    }
}