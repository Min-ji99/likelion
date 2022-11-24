package week10.day1124;

import java.util.Scanner;

public class codeup_1852 {
    public static void printNum(int i, int n) {
        if(i>n) return;
        System.out.printf("%d ", i);
        printNum(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNum(1, n);
    }
}
