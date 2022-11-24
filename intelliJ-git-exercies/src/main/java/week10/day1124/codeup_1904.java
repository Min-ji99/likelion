package week10.day1124;

import java.util.Scanner;

public class codeup_1904 {
    public static void findOdd(int a, int b){
        if(b<a) return;
        if(a%2==1) System.out.printf("%d ", a);
        findOdd(a+1, b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        findOdd(a, b);
    }
}
