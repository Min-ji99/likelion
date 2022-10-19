package week5.day1018;

import java.util.Scanner;

public class RectangleStar {
    private char c;
    public RectangleStar(){
        this.c='*';
    }
    public RectangleStar(char c){
        this.c=c;
    }
    void printSquareMatrix(int n, int m){
        for(int i=0; i<n; i++){
            /*
            for(int j=0; j<n; j++){
                System.out.print(c);
            }
            System.out.println();
             */
            System.out.println("*".repeat(m));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        RectangleStar rectangleStar = new RectangleStar();
        rectangleStar.printSquareMatrix(n, m);
    }
}
