package sec05;

import java.util.*;

// 쇠막대기 : ()의 ) 가 레이저끝을 알릴수도, 막대기의 끝을 알릴수도있음
public class Main5 {
    public int solution(String str){
        int ans = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '('){
                stack.push('(');
            } else {
                stack.pop();
                //레이저 - 스택의 막대기 개수 더해줌
                if(str.charAt(i-1) == '(') ans += stack.size();
                // 막대기의 끝 - 답 한 개 더해줌
                else ans++;
                }
            }
        return ans;
    }

    public static void main(String[] args){
        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}
