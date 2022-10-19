//2차원배열에서 최댓값
package week4.day1012.codeup.codeup_4596;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max=0;
        int[] max_idx=new int[2];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j]=sc.nextInt();
                if(max<arr[i][j]){
                    max=arr[i][j];
                    max_idx[0]=i+1;
                    max_idx[1]=j+1;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", max_idx[0], max_idx[1]);
    }
}
