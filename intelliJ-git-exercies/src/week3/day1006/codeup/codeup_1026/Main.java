package week3.day1006.codeup.codeup_1026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] times = time.split(":");
        System.out.println(Integer.parseInt(times[1]));
    }
}
