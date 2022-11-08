package week8.codeup_3001;

import java.util.ArrayList;
import java.util.Scanner;

public class UseList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        int value=sc.nextInt();
        int idx=list.indexOf(value);
        if(idx==-1) System.out.println(-1);
        else System.out.println(idx+1);
    }
}
