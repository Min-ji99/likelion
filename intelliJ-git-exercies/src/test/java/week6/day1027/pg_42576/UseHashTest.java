package week6.day1027.pg_42576;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UseHashTest {
    UseHash useHash;
    String[] participant1;
    String[] participant2;
    String[] participant3;

    String[] completion1;
    String[] completion2;
    String[] completion3;

    @BeforeEach
    public void setup(){
        useHash=new UseHash();
        participant1=new String[]{"leo", "kiki", "eden"};
        participant2=new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        participant3=new String[]{"mislav", "stanko", "mislav", "ana"};
        completion1=new String[]{"eden", "kiki"};
        completion2=new String[]{"josipa", "filipa", "marina", "nikola"};
        completion3=new String[]{"stanko", "ana", "mislav"};
    }

    @Test
    public void soluetionTest(){
        assertEquals("leo", useHash.solution(participant1, completion1));
        assertEquals("vinko", useHash.solution(participant2, completion2));
        assertEquals("mislav", useHash.solution(participant3, completion3));

    }
}