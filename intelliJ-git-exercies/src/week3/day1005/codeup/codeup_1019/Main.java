package week3.day1005.codeup.codeup_1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr=s.split("\\.");

        System.out.printf("%04d.%02d.%02d", Integer.valueOf(arr[0]), Integer.valueOf(arr[1]), Integer.valueOf(arr[2]));
    }
}
