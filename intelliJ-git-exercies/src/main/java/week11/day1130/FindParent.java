package week11.day1130;

import java.util.Scanner;

public class FindParent {
    public static int lca(int a, int b){
        if(a>b) return lca(a/2, b)+1;
        if(a<b) return lca(a, b/2)+1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(lca(a, b));
    }
}
