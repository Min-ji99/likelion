package week3.day1006.collections.set;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int num){
        return (int)(Math.random()*num);
    }
}
