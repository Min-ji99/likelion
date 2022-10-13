package week3.day1005.randomcalculator;

public class RandomCreator implements NumberCreate {
    @Override
    public int numberCreate(int num){
        return (int)(Math.random()*num);
    }
}
