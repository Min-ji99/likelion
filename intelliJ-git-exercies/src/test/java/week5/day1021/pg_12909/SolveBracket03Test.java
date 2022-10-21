package week5.day1021.pg_12909;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracket03Test {
    @Test
    @DisplayName("올바른 괄호")
    void solution(){
        SolveBracket03 solveBracket03=new SolveBracket03();
        assertFalse(solveBracket03.solution("{}()[](({))"));
        assertTrue(solveBracket03.solution("{}()[](({}))"));
    }

}