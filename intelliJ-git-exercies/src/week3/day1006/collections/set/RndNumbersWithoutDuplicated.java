package week3.day1006.collections.set;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> withoutDuplicated = new HashSet<>();
        System.out.println("========중복제거 전=========");
        for(int i=0; i<50; i++){
            int r=randomNumberGenerator.generate(100);
            withoutDuplicated.add(r);
            System.out.printf("%d ", r);
        }
        System.out.println();
        System.out.println("========중복제거 후=========");
        System.out.println(withoutDuplicated);
    }
}
