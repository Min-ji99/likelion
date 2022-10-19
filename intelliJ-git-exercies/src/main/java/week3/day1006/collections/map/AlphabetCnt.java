package week3.day1006.collections.map;

import java.util.HashMap;

public class AlphabetCnt {
    public boolean isAlphabet(char c){
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        AlphabetCnt alphabetCnt = new AlphabetCnt();

        String s1="aabbccddeffghijkkkkkllm/mmm;".toUpperCase();
        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for(char ch='A'; ch<='Z'; ch++){
            alphabetMap.put(ch, 0);
        }
        for(int i=0; i<s1.length(); i++) {
            //System.out.println(s1.charAt(i));
            //char c = Character.valueOf('A') 'A'와 같은 타입만 참조하겠다.
            char ch=s1.charAt(i);
            if (alphabetCnt.isAlphabet(ch)) {
                alphabetMap.put(ch, alphabetMap.get(ch)+1);
            }
        }
        System.out.println(alphabetMap);
    }
}
