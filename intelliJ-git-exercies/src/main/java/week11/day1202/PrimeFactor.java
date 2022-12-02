package week11.day1202;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
입력받은 숫자의 약수를 구한다.
그 약수가 소수인지 판별
소수이면 최댓값인지 비교한다.
 */
public class PrimeFactor {
    public static boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static List<Integer> divisor(int num){
        List<Integer> primeFactor=new ArrayList<>();
        for(int i=2; i*i<=num; i++){
            if(!isPrime(i)) continue;
            while(num%i==0){
                num/=i;
                primeFactor.add(i);
            }
        }
        if(num!=1){
            primeFactor.add(num);
        }
        return primeFactor;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        List<Integer> primeFactor=divisor(num);
        for(Integer n : primeFactor){
            System.out.printf("%d ", n);
        }
    }
}
