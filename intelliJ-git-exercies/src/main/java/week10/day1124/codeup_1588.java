package week10.day1124;

import java.util.Scanner;

public class codeup_1588 {
    public static int solution(int n, int r){
        if(r>n) return 0;
        if(r==0 || r==n) return 1;
        if(r==1) return n;
        return solution(n-1, r-1)+solution(n-1, r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(solution(n-1, r-1));
    }
}
