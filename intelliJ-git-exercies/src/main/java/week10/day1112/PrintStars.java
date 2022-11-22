package week10.day1112;

import java.util.Scanner;

public class PrintStars {
    public void printOneStar(int i, int n){
        if(i>n) return;
        System.out.print("*");
        printOneStar(i+1, n);
    }
    public static void main(String[] args) {
        PrintStars printStars=new PrintStars();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printStars.printOneStar(1, n);
    }
}
