package week6.day1028.pg_42577;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumListTest {
    PhoneNumList phoneNum;
    String[] phone_book1;
    String[] phone_book2;
    String[] phone_book3;

    @BeforeEach
    void setup(){
        phoneNum=new PhoneNumList();
        phone_book1=new String[]{"119", "97674223", "1195524421"};
        phone_book2=new String[]{"123","456","789"};
        phone_book3=new String[]{"12","123","1235","567","88"};
    }
    @Test
    void solutionTest(){
        assertFalse(phoneNum.solution(phone_book1));
        assertTrue(phoneNum.solution(phone_book2));
        assertFalse(phoneNum.solution(phone_book3));
    }

}