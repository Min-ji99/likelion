package week10.day1125;

import java.util.Scanner;

public class codeup_2623 {
    public static int recursiveSolution(int a, int b){
        if(a==b) return a;
        if(a>b) return recursiveSolution(a-b, b);
        return recursiveSolution(a, b-a);
    }
    public static int loopSolution(int a, int b){
        if(b>a){
            int tmp=a;
            a=b;
            b=tmp;
        }
        while(b!=0){
            int n=a%b;
            a=b;
            b=n;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(recursiveSolution(a, b));
        System.out.println(loopSolution(a, b));
    }
}
