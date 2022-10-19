package week3.day1006.collections.map;

import java.util.HashMap;
import java.util.Map;

public class AlphabetCount {
    public static void main(String[] args) {
        String repoAddr ="https://github.com/Min-ji99/intelliJ-git-exercies";
        HashMap<Character, Integer> alphabetCnt = new HashMap<>();

        for(int i=0; i<repoAddr.length(); i++){
            char ch = repoAddr.charAt(i); //repoArr에서 문자 하나씩 가져오기
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) { //알파벳인지 확인(대문자, 소문자 모두 확인)
                if (ch <= 90) { //대문자이면 소문자로 변환
                    ch += 32;
                }
                //해당 알파벳 count 1 증가
                if (alphabetCnt.get(ch) == null) {
                    alphabetCnt.put(ch, 1);
                } else {
                    alphabetCnt.put(ch, alphabetCnt.get(ch) + 1);
                }
            }
            else{
                continue;
            }
        }
        for(Map.Entry<Character, Integer> alphabet : alphabetCnt.entrySet()){
            System.out.println(alphabet.getKey() + " : " + alphabet.getValue());
        }
    }
}
