package week3.day1005.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void plus(){
        System.out.printf("%d + %d = %d\n", a, b, a+b);
    }
    public void minus() {
        System.out.printf("%d + %d = %d\n", a, b, a-b);
    }

    public void multi() {
        System.out.printf("%d + %d = %d\n", a, b, a*b);
    }
    public void div() {
        System.out.printf("%d + %d = %f\n", a, b, a/(float)b);
    }
}
