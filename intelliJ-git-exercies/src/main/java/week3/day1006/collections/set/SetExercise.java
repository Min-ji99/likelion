package week3.day1006.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("김경록");
        set1.add("김민지");
        set1.add("김민지");
        System.out.println(set1);

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        System.out.println(setInteger);
    }
}
