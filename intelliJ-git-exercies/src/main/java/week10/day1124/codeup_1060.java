package week10.day1124;

import java.util.Scanner;

public class codeup_1060 {
    public static void printLine(int n){
        if(n==0) return;
        printLine(n-1);
        System.out.printf("%d ", n);
    }
    public static void numTriangle(int n){
        if(n==0) return;
        numTriangle(n-1);
        printLine(n);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        numTriangle(n);
    }
}
