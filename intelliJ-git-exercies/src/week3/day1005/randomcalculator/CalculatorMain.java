package week3.day1005.randomcalculator;

public class CalculatorMain {
    public static void main(String[] args) {
        //Calculator cal = new Calculator(10, 20);
        NumberCreate randomCreator = new RandomCreator();
        Calculator randomCalculator = new Calculator(10, randomCreator);
        System.out.println("-------RandomCalculator--------");
        randomCalculator.plus(20);
        randomCalculator.minus(20);
        randomCalculator.multi(20);
        randomCalculator.div(20);

        System.out.println("-------speceficCalculator--------");
        Calculator speceficCalculator = new Calculator(10, new SpecificNumberCreator());
        speceficCalculator.plus(20);
        speceficCalculator.minus(20);
        speceficCalculator.multi(20);
        speceficCalculator.div(20);
    }
}
