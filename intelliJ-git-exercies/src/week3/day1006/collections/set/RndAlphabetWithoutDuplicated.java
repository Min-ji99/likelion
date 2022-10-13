package week3.day1006.collections.set;

import java.util.HashSet;
import java.util.Set;

public class RndAlphabetWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Character> withoutDuplicated = new HashSet<>();
        System.out.println("=====중복제거 전=====");
        for(int i=0; i<50; i++){
            char r = (char)(randomNumberGenerator.generate(26)+65);
            System.out.printf("%c ", r);
            withoutDuplicated.add(r);
        }
        System.out.println();
        System.out.println("=====중복제거 후=====");
        System.out.println(withoutDuplicated);
    }
}
