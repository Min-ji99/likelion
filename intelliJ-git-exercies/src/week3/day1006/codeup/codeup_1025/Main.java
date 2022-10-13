package week3.day1006.codeup.codeup_1025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=10000; i>=1; i/=10){
            System.out.println("["+n/i*i+"]");
            n=n%i;
        }
    }
}
