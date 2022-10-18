package week5.day1018.algorithm;

import java.util.Scanner;

public class SquarStar {
    private char c;
    public SquarStar(){
        this.c='*';
    }
    public SquarStar(char c){
        this.c=c;
    }
    void printSquareMatrix(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        SquarStar squarStar = new SquarStar();
        squarStar.printSquareMatrix(n);
    }
}
