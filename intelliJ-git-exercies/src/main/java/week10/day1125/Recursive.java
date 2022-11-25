package week10.day1125;

public class Recursive {
    public static void recur(int n) {
        while(n > 0){
            recur(n - 1);
            System.out.println(n);
            n = n - 2;
        }
    }
    public static void main(String[] args) {
        recur(3); //1 2 3 1
        recur(4); //1 2 3 1 4 1 2
    }
}
