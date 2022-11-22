package week10.day1112;

import java.util.Scanner;

public class PrintSum {
    public int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        PrintSum printSum=new PrintSum();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(printSum.sum(n));
    }
}
