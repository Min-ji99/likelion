package week10.day1122;

import java.util.Scanner;

public class DigitSum {
    public long sum(long n){
        if(n==0) return 0;
        return n%10+sum(n/10);
    }
    public static void main(String[] args) {
        DigitSum digitSum=new DigitSum();
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(digitSum.sum(n));
    }
}
