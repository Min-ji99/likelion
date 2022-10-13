package week3.day1005.randomcalculator;

public class SpecificNumberCreator implements NumberCreate {
    @Override
    public int numberCreate(int num) {
        return 2000*num;
    }
}
