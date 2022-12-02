package week11.day1202;

import java.util.Scanner;

public class codeup_2203 {
    public static boolean isPrime(long num){
        for(long i=2; i*i<=num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        long max=0;
        for(long i=1; i*i<=num; i++){
            if(num%i==0) {
                if (isPrime(i)) {
                    max = Math.max(max, i);
                }
                if (isPrime(num / i)) {
                    max = Math.max(max, num / i);
                }
            }
        }
        System.out.println(max);
    }
}
