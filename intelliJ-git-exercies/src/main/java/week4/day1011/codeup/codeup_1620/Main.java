package week4.day1011.codeup.codeup_1620;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while (true){
            while(n>0) {
                sum += n % 10;
                n /= 10;
            }
            if(sum/10 == 0){
                break;
            }
            n=sum;
            sum=0;

        }
        System.out.println(sum);
    }
}
