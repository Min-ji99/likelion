package week10.day1125;

import java.util.Scanner;

public class codeup_2623 {
    public static int solution(int a, int b){
        if(a==b) return a;
        if(a>b) return solution(a-b, b);
        return solution(a, b-a);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(solution(a, b));
    }
}
