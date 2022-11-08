package week8;

import java.util.Scanner;

public class Codeup_3001 {
    public int findUseLoop(int value, int n, int[] arr){
        int idx=-1;
        for(int i=0; i<n; i++){
            if(value==arr[i]) idx=i;
        }
        if(idx!=-1) idx+=1;
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Codeup_3001 codeup=new Codeup_3001();

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int value=sc.nextInt();
        System.out.println(codeup.findUseLoop(value, n, arr));
    }
}
