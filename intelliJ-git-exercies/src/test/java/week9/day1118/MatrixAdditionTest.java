package week9.day1118;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixAdditionTest {
    MatrixAddition matrixAddition;
    int[][] arr1;
    int[][] arr2;
    int[][] result;

    @BeforeEach
    void setup(){
        matrixAddition=new MatrixAddition();
        arr1=new int[][]{{1, 2}, {2, 3}};
        arr2=new int[][]{{3, 4}, {5, 6}};
        result=new int[][]{{4, 6}, {7, 9}};
    }
    @Test
    void solutionTest(){
        assertArrayEquals(result, matrixAddition.solution(arr1, arr2));
    }
}