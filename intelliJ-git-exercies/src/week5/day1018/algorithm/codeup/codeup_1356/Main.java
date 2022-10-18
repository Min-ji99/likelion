package week5.day1018.algorithm.codeup.codeup_1356;

import java.util.Scanner;

public class Main {
    void printSquar(int n){
        for(int i=1; i<=n; i++){
            if(i==1 || i==n){
                for(int j=0; j<n; j++){
                    System.out.print("*");
                }
                System.out.println();
                //codeup은 repeat 안됨
                //System.out.println("*".repeat(n));
            }else{
                System.out.print("*");
                for(int j=0; j<n-2; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Main m=new Main();
        m.printSquar(n);
    }
}
