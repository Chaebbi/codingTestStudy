package sec05;

import java.util.*;

// 후위식 연산
public class Main4 {
    public int solution(String str){
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                //stack.push(Integer.valueOf(x));
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') stack.push(lt + rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '*') stack.push(lt * rt);
                else if (x == '/') stack.push(lt / rt);
            }
        }
        ans = stack.get(0);
        return ans;
    }

    public static void main(String[] args){
        Main4 T = new Main4();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}
