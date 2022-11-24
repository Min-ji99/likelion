package week10.day1124;

import java.util.Scanner;

public class codeup_1856 {
    public static int jump(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        return jump(n-2)+jump(n-1)+jump(n-3);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(jump(n));
    }
}
