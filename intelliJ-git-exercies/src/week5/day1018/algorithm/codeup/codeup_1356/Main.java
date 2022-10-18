package week5.day1018.algorithm.codeup.codeup_1356;

import java.util.Scanner;

public class Main {
    void printSquar(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Main m=new Main();
        m.printSquar(n);
    }
}
