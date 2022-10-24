package week5.day1021.codeup_3129;

import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static String solution(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    return "bad";
                }
            }
        }
        if(stack.isEmpty()){
            return "good";
        }
        return "bad";
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println(solution(str));
    }
}
