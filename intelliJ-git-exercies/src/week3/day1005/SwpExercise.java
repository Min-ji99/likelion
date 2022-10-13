package week3.day1005;

public class SwpExercise {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        int tmp=a;

        a=b;
        b=tmp;
        System.out.printf("a: %d b: %d", a, b);
    }
}
