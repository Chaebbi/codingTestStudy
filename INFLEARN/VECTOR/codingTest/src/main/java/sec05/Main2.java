package sec05;

import java.util.*;

// 괄호문자제거 : 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램
public class Main2 {
    public String solution(String str){
        String ans = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == ')'){
                while(stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }
        //get 으로 stack의 인덱스 번호로 조회 가능
        for(int i=0; i<stack.size(); i++) ans += stack.get(i);

        return ans;
    }

    public static void main(String[] args){
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}
