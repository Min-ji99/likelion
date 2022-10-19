package week5.day1018.codeup.codeup_1859;

import java.util.Scanner;

public class Main {
    void printARow(int n){
        if(n==0) return;
        printARow(n-1);
        System.out.print("*");
    }
    void printACol(int n){
        if(n==0) return;

        printACol(n-1);
        printARow(n);

        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Main m=new Main();
        m.printACol(n);
    }
}
