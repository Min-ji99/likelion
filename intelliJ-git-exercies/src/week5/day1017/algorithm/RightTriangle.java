package week5.day1017.algorithm;

import java.util.Scanner;

public class RightTriangle {
    private char c;
    public RightTriangle(){
        this.c='*';
    }
    public RightTriangle(char c){
        this.c=c;
    }
    public void printRightTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
    public void printLeftTriangle(int n){

        for(int i=0; i<n; i++){
            for(int j=n-i-1; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print(c);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);

        RightTriangle rt = new RightTriangle(c);
        rt.printRightTriangle(n);
        System.out.println("===============");
        rt.printLeftTriangle(n);
    }
}
