package week7.pg_12921;

public class FindPrime {

    //3번 방법
    public boolean isPrime(int n){
        if(n==2) return true;
        for(int i=2; i<Math.sqrt(n)+1; i++){
            if(n%i==0) return false;
        }
        return true;

    }
    public int solution(int n) {
        int answer = 0;
        FindPrime findPrime=new FindPrime();
        /*
        System.out.println("13은 소수이다 : "+findPrime.isPrime1(13));
        System.out.println("17은 소수이다 : "+findPrime.isPrime1(17));
        System.out.println("19은 소수이다 : "+findPrime.isPrime1(19));
        System.out.println("23은 소수이다 : "+findPrime.isPrime1(23));
        */
        for(int i=2; i<=n; i++){
            if(isPrime(i)) {
                answer+=1;
                System.out.println(i);
            }
        }
        return answer;
    }
}
