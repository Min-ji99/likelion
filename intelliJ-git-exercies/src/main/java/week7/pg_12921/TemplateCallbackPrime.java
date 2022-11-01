package week7.pg_12921;

public class TemplateCallbackPrime {
    boolean someOpertion(int a, int b){
        return a<b;
    }
    boolean isPrime(int num){
        for(int i=2; someOpertion(i, num); i++){
            if(num%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime templateCallbackPrime=new TemplateCallbackPrime();
        System.out.println(templateCallbackPrime.isPrime(13));
    }
}
