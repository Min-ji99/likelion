package week5.day1021.pg_12909;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracket01Test {
    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracketStack() {
        SolveBracket01 solveBracket01 =new SolveBracket01();


        assertTrue(solveBracket01.solution("()()"));
        assertFalse(solveBracket01.solution(")()("));
        assertTrue(solveBracket01.solution("(())()"));
        assertFalse(solveBracket01.solution("(()("));
        assertFalse(solveBracket01.solution("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"));
    }
}