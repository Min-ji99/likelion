package week5.day1017.algorithm;

import java.util.Scanner;

public class Pyramid {
    private char c;
    public Pyramid(){
        this.c='*';
    }
    public Pyramid(char c){
        this.c=c;
    }
    public void printPyramid(int n){
        for (int i = 0; i < n; i++) {
            for(int j=n-1-i; j>0; j--){
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char c= sc.next().charAt(0);

        Pyramid pyramid = new Pyramid(c);
        pyramid.printPyramid(n);
    }
}
