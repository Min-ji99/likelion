package week3.day1006.codeup.codeup_1023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String[] strArr=str.split("\\.");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
    }
}
