/*
여는 괄호 : stack에 push

닫는 괄호 :
1. 여는 괄호가 있다면 stack에 있는 여는 괄호 pop
2. 여는 괄호가 없다면 올바르지 않은 괄호니까 false 반환

문자열에 있는 괄호들을 다 체크한 후 :
stack에 하나라도 남아있다면 괄호의 짝이 맞지 않기 때문에 false 반환
stack이 비어있으면 true 반환
*/
package week5.day1021.pg_12909;

import java.util.Stack;

public class SolveBracket02 {
    boolean solution(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
