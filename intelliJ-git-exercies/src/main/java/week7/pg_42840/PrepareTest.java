package week7.pg_42840;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1. 수포자 3명의 찍는 패턴을 저장하는 배열을 생성한다.
2. answers와 비교해서 3명의 수포자 점수를 계산한다.
    2-1. 패턴이 반복되기 때문에 학생이 찍은 답은 i%pettern.length와 동일하다.
3. 수포자 점수 중에 최댓값을 찾는다.
4. 최댓값을 갖고 있는 수포자를 answer 배열에 넣는다.
 */
public class PrepareTest {
    public int calcScore(int[] answers, int[] pettern){
        int score=0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==pettern[i%pettern.length]){
                score+=1;
            }
        }
        return score;
    }
    public int[] findMaxPerson(int[] scores, int maxScore){
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<scores.length; i++){
            if(maxScore==scores[i]){
                list.add(i+1);
            }
        }
        int[] answer=new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[][] pettern={{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        PrepareTest prepareTest =new PrepareTest();
        int[] scores=new int[3];
        int maxScore=0; //최대 점수
        for(int i=0; i<pettern.length; i++){
            scores[i]= prepareTest.calcScore(answers, pettern[i]); //점수 계산
            if(maxScore<scores[i]){
                maxScore=scores[i];
            }
        }
        answer=prepareTest.findMaxPerson(scores, maxScore);
        return answer;
    }
}
