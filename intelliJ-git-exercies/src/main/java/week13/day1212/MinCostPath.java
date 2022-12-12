package week13.day1212;

import java.util.Arrays;

public class MinCostPath {
    public static int min(int a, int b, int c){
        int min=a;
        if(min>b) min=b;
        if(min>c) min=c;

        return min;
    }
    public static void main(String[] args) {
        int[][] matrix=new int[][]{{1, 3, 2}, {4, 6, 2},{1, 2, 4}};
        int[][] dp=new int[matrix.length][matrix[0].length];

        dp[0][0]=matrix[0][0];
        for(int i=1; i<matrix[0].length; i++){
            dp[0][i]=dp[0][i-1]+matrix[0][i];
        }
        for(int j=1; j<matrix.length; j++){
            dp[j][0]=dp[j-1][0]+matrix[j][0];
        }
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                dp[i][j]=min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1])+matrix[i][j];
            }
        }
        for(int i=0; i< matrix.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
    }
}
