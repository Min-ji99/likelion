package week10.day1124;

import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n){
        if (n<=2) return 1;
        return fib(n-2)+fib(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
}
