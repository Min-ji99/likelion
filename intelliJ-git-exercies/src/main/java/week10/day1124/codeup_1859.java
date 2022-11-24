package week10.day1124;

import java.util.Scanner;

public class codeup_1859 {
    public static void getLine(int n){
        if(n==0) return;
        getLine(n-1);
        System.out.print("*");
    }
    public static void printStar(int n){
        if(n==0) return;
        printStar(n-1);
        getLine(n);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printStar(n);
    }
}
