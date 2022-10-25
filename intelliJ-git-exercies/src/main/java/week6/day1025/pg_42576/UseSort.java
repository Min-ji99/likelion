package week6.day1025.pg_42576;

import java.util.Arrays;

public class UseSort {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
    public static void main(String[] args) {
        String[] participant={"leo", "kiki", "eden"};
        String[] completion={"eden", "kiki"};

        CheckPlayer checkPlayer=new CheckPlayer();
        System.out.println(checkPlayer.solution(participant, completion));
    }
}
