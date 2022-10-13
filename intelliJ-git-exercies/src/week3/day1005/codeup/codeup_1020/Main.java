package week3.day1005.codeup.codeup_1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr=s.split("-");
        System.out.printf("%s%s", arr[0], arr[1]);
    }
}
