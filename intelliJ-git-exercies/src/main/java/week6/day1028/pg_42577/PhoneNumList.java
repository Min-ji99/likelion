package week6.day1028.pg_42577;

import java.util.Arrays;

public class PhoneNumList {

    /*
    1. 전화번호들을 순서대로 정렬한다.
    2. phone_book[i]가 phone_book[j]의 접두어인지 확인
        1. phone_book[j]를 앞에서부터 phone_book[i]길이만큼 자르고 tmp에 저장
        2-1. tmp와 phone_book[i]가 같다면 False를 반환
        2-2. 다르다면 phone_book[j]뒤로는 접두어인 경우가 없기 때문에 break
    */
    public boolean solution1(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length-1; i++){
            for(int j=i+1; j< phone_book.length; j++){
                if(phone_book[j].length()<phone_book[i].length()){ //phone_book[i]가 더 길면 자를 수 없음
                    break;
                }
                String tmp=phone_book[j].substring(0, phone_book[i].length()); //phone_book[j]를 앞에서부터 phone_book[i]길이만큼 자르기
                if(tmp.equals(phone_book[i])){ //접두어인지 확인
                    return false;
                }else{
                    break;
                }

            }
        }
        return answer;
    }
    //startsWith 메서드 사용
    public boolean solution2(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length-1; i++){
            for(int j=i+1; j< phone_book.length; j++){
                if(phone_book[j].startsWith(phone_book[i])){
                    return false;
                }else{
                    break;
                }
            }
        }
        return answer;
    }
}
