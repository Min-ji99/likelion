package week9.day1118;

import java.util.Arrays;

public class CaesarCipher {
    public String solution(String s, int n){
        String answer="";
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                answer += s.charAt(i);
                continue;
            }
            /*
            ch+n으로 알파벳을 밀어주기
            a를 빼주면 나머지가 0이면 a 25이면 z
             */
            if (ch >= 'a' && ch <= 'z') {
                answer+=(char)((ch+n-'a')%26+'a');
            }else if(ch>='A' && ch<='Z'){
                answer+=(char)((ch+n-'A')%26+'A');
            }
        }
        return answer;
    }
}
