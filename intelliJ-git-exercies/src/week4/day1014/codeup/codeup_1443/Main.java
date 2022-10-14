package week4.day1014.codeup.codeup_1443;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i]=sc.nextInt();
        }

        int key, j;
        for(int i=2; i<=n; i++){
            key=arr[i];
            for(j=i-1; j>=1 && arr[j]>=key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j+1]=key;
        }
        for(int i=1; i<=n; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}
