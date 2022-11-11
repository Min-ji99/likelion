package week8.pg_70129;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PG_70129Test {
    PG_70129 pg_70129;
    String str1;
    String str2;
    String str3;

    @BeforeEach
    void setup(){
        pg_70129=new PG_70129();
        str1="110010101001";
        str2="01110";
        str3="1111111";
    }
    @Test
    void solutionTest(){
        assertArrayEquals(new int[]{3, 8}, pg_70129.solution(str1));
        assertArrayEquals(new int[]{3, 3}, pg_70129.solution(str2));
        assertArrayEquals(new int[]{4, 1}, pg_70129.solution(str3));
    }
}