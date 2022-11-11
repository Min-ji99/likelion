package week8.pg_17681;

/*
1. 전체 지도 구하기
   비트 연산자 or로 계산
2. 연산 결과를 이진수로 변경
    1이면 # 아니면 공백
 */
public class PG_17681 {
    public String toBinaryString(int n){
        StringBuilder sb=new StringBuilder("");
        while (n > 0) {
            sb.append(Integer.toString(n%2));
            n/=2;
        }

        return sb.reverse().toString();
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        String[] maps=new String[arr1.length];
        PG_17681 pg_17681=new PG_17681();
        for(int i=0; i<arr1.length; i++){
            maps[i]=pg_17681.toBinaryString(arr1[i]|arr2[i]);
            //System.out.println(maps[i]);
            maps[i]=maps[i].replace("1", "#");
            maps[i]=maps[i].replace("0", " ");

            while (maps[i].length()<n){
                maps[i]=' '+maps[i];
            }
        }

        return maps;
    }
}
