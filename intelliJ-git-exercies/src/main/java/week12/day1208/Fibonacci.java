package week12.day1208;

import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int n, int[] dp) {
        if(n<=1) return 1;
        dp[n]=fibo(n-1, dp)+fibo(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2; i<=n; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
