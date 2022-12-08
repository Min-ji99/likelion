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
        System.out.println(fibo(n, dp));
    }
}
