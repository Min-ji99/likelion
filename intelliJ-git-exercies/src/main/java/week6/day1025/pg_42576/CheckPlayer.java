package week6.day1025.pg_42576;

import java.util.HashMap;
import java.util.Map;

public class CheckPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> checkMap=new HashMap<String, Integer>();
        for(String p:participant){
            checkMap.put(p, checkMap.getOrDefault(p, 0)+1);
        }
        for(String c:completion){
            checkMap.put(c, checkMap.get(c)-1);
        }
        for(String key:checkMap.keySet()){
            if(checkMap.get(key)!=0){
                answer=key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] participant={"leo", "kiki", "eden"};
        String[] completion={"eden", "kiki"};

        CheckPlayer checkPlayer=new CheckPlayer();
        System.out.println(checkPlayer.solution(participant, completion));
    }
}
