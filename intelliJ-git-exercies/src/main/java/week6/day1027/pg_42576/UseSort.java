package week6.day1027.pg_42576;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
정렬 이용
participant와 completion을 각각 정렬한다
participant과 completion에서 동일한 index 값이 다르면 완주하지 못한 선수
 */
public class UseSort {
    public String solution(String[] participant, String[] completion){
        String answer="";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<participant.length; i++){
            if(participant[i].equals(completion[i])){
                answer=participant[i];
                break;
            }
        }
        return answer;
    }
}
