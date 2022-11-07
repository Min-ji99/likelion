package week8.pg_12947;

public class HarshadNumber {
    public int sumOfDigits(int x){
        int sum=0;
        while(x>0){
            sum+=x%10;
            x/=10;
        }
        return sum;
    }
    public boolean solution(int x) {
        boolean answer = true;
        int sum=sumOfDigits(x);
        return answer;
    }
}
