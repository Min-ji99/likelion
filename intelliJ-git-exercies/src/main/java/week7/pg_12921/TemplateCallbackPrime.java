package week7.pg_12921;

interface StatementStrategy{
    boolean compare(int a, int b);
}
public class TemplateCallbackPrime{
    boolean isPrime(int num, StatementStrategy stmt){
        for(int i=2; stmt.compare(i, num); i++){
            if(num%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime templateCallbackPrime=new TemplateCallbackPrime();
        System.out.println(templateCallbackPrime.isPrime(13, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a<b;
            }
        }));
    }


}
