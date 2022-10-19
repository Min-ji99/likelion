package week5.day1017;

import java.util.Scanner;

public class Diamond {
    private char c;
    public Diamond(){
        this.c='*';
    }
    public Diamond(char c){
        this.c=c;
    }
    public void printDiamod(int n){
        for (int i = 0; i < n; i++) {
            for(int j=n-1-i; j>0; j--){
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
        for(int i=0; i<n-1; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(n-i-1)*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char c=sc.next().charAt(0);
        Diamond diamond=new Diamond(c);
        diamond.printDiamod(n);
    }
}
