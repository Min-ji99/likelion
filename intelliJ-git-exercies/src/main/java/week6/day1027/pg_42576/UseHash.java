package week6.day1027.pg_42576;

import java.util.HashMap;
import java.util.Map;

/*
HashMap key:participant, value:이름 count
participant를 돌면서 이름이 있을 때마다 value 증가
completion을 돌면서 완주한 경우 value 1씩 감소
 */
public class UseHash {
    public String solution(String[] participant, String[] completion) {
        String answer="";
        Map<String, Integer> completeMap=new HashMap<>();
        for(String player : participant){
            completeMap.put(player, completeMap.getOrDefault(player, 0)+1); //getOrDefault->key가 없으면 default값 설정
        }
        for(String player:completion){
            completeMap.put(player, completeMap.get(player)-1);
        }
        for(String key:completeMap.keySet()){
            if(completeMap.get(key)!=0){
                answer=key;
            }
        }
        return answer;
    }
}
