package week7.pg_12921;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveMultiOfTest {
    RemoveMultiOf removeMultiOf;
    int num1;

    @BeforeEach
    void setup(){
        removeMultiOf=new RemoveMultiOf();
        num1=50;
    }
    @Test
    void case1(){
        assertEquals(15, removeMultiOf.solution(50));
    }
}