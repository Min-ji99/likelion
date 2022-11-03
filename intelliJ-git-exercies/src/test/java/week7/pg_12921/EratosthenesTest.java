package week7.pg_12921;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EratosthenesTest {
    Eratosthenes eratosthenes;

    int n1;
    int n2;

    @BeforeEach
    void setup(){
        eratosthenes=new Eratosthenes();

        n1=10;
        n2=5;
    }
    @Test
    void case1(){
        assertEquals(4,eratosthenes.solution(n1));
    }
    @Test
    void case2(){
        assertEquals(3,eratosthenes.solution(n2));
    }

}