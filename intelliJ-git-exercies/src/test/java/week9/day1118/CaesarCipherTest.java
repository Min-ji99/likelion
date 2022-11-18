package week9.day1118;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {
    CaesarCipher caesarCipher;

    String s1;
    String s2;
    String s3;

    int n1;
    int n2;
    int n3;

    @BeforeEach
    void setup(){
        caesarCipher=new CaesarCipher();
        s1="AB";
        s2="z";
        s3="a B z";
        n1=1;
        n2=1;
        n3=4;
    }
    @Test
    void solutionTest(){
        assertEquals("BC", caesarCipher.solution(s1, n1));
        assertEquals("a", caesarCipher.solution(s2, n2));
        assertEquals("e F d", caesarCipher.solution(s3, n3));
    }

}