package week10.week1122;

public class PrintTo100V2 {
    public static void print1To100(int n) {
        if(n==100) return;
        System.out.println(n);
        print1To100(n);
    }
    public static void main(String[] args) {
        print1To100(1);
    }

}
