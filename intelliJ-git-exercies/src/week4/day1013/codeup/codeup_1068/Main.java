package week4.day1013.codeup.codeup_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=90){
            System.out.println("A");
        }else if(n>=70){
            System.out.println("B");
        }else if(n>=40){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }

}
