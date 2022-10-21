package week5.day1021.pg_12909;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {
    @Test
    @DisplayName("괄호가 잘 풀리는지 스택으로 체크")
    void bracketStack() {
        SolveBracket solveBracket=new SolveBracket();


        assertTrue(solveBracket.solutionStack("()()"));
        assertFalse(solveBracket.solutionStack(")()("));
        assertTrue(solveBracket.solutionStack("(())()"));
        assertFalse(solveBracket.solutionStack("(()("));
        assertFalse(solveBracket.solutionStack("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"));
    }
}