package week3.day1006.codeup.codeup_1027;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date=sc.nextLine();
        String[] dates=date.split("\\.");
        System.out.printf("%02d-%02d-%04d", Integer.parseInt(dates[2]), Integer.parseInt(dates[1]), Integer.parseInt(dates[0]));

    }
}
