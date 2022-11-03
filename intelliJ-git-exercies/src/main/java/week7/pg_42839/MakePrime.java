package week7.pg_42839;

import java.util.HashSet;

/*
1. 종이조각을 선택할 수 있는 경우 구하기(순열)
2. 종이조각을 붙여서 만든 숫자가 소수인지 판단
 */
public class MakePrime {
    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }

        return true;
    }
    /*
     DFS로 모든 인덱스를 방문하며 output에 값을 넣는다.
     이미 들어간 값은 visited 값을 true로 바꾸어 중복하여 넣지 않는다.
     depth 값은 output에 들어간 숫자의 길이라고 생각하면 된다.
     depth의 값이 r만큼 되면 output에 들어있는 값을 출력한다.
    */
    public void permutation(String numbers, HashSet<Integer> output, boolean[] visited, int depth, StringBuilder stringBuilder){
        for(int i=0; i<visited.length; i++){
            if(visited[i]) continue;
            visited[i]=true;
            stringBuilder.append(numbers.charAt(i));
            output.add(Integer.parseInt(stringBuilder.toString()));
            permutation(numbers, output, visited, depth+1, stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            visited[i]=false;
        }
    }

    public int solution(String numbers) {
        MakePrime makePrime=new MakePrime();
        int answer = 0;
        HashSet<Integer> numSet=new HashSet<>();
        makePrime.permutation(numbers, numSet, new boolean[numbers.length()], 0, new StringBuilder());

        for(Integer num : numSet){
            if(makePrime.isPrime(num)) {
                answer+=1;
                System.out.println(num);
            }
        }

        return answer;
    }
}
