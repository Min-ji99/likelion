package week7.pg_42839;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakePrimeTest {
    MakePrime makePrime;
    String number1;
    String number2;
    @BeforeEach
    void setup(){
        makePrime=new MakePrime();

        number1="17";
        number2="011";
    }
    @Test
    void case1(){
        assertEquals(3,makePrime.solution(number1));
    }
    @Test
    void case2(){
        assertEquals(2,makePrime.solution(number2));
    }
}