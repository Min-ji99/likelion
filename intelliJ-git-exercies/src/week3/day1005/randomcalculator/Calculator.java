package week3.day1005.randomcalculator;

public class Calculator {
    private int a;
    NumberCreate numberCreator;

    public Calculator(int a, NumberCreate numberCreate){
        this.a = a;
        this.numberCreator = numberCreate;
    }
    public void plus(int num){
        int b = numberCreator.numberCreate(num);
        System.out.printf("%d + %d = %d\n", a, b, a+b);
    }
    public void minus(int num){
        int b = numberCreator.numberCreate(num);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
    }
    public void multi(int num){
        int b = numberCreator.numberCreate(num);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
    }
    public void div(int num){
        try {
            int b = numberCreator.numberCreate(num);
            if (b == 0) {
                Exception e = new Exception("랜덤하게 생성된 숫자가 0입니다.");
                throw e;
            }
            System.out.printf("%d / %d = %f\n", a, b, a/(float)b);
        }catch(Exception e) {
            System.out.println("에러 메세지 : " + e.getMessage());
        }
    }
}
