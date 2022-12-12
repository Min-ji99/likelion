package week13.day1212;

public class MinCostPath {
    public static void main(String[] args) {
        int[][] matrix=new int[][]{{1, 3, 2}, {4, 6, 2},{1, 2, 4}};
        int[][] dp=new int[matrix.length][matrix[0].length];

        dp[0][0]=matrix[0][0];

    }
}
