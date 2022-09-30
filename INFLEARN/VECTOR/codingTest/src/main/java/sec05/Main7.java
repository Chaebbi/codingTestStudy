package sec05;

import java.util.*;

// 교육과정 설계 : 필수과목 주어지고, 꼭 이 순서대로 들어야함. + 필수과목 안들어도 no
public class Main7 {
    public String solution(String need, String plan){
        String ans = "YES";
        Queue<Character> queue = new LinkedList<>();
        for(char x : need.toCharArray()) queue.offer(x);

        for(char x : plan.toCharArray()) {
            if(queue.contains(x)) {
                if(x != queue.poll()) return "NO";
            }
        }
        if(!queue.isEmpty()) return "NO";
        return ans;
    }

    public static void main(String[] args){
        Main7 T = new Main7();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a, b));

    }
}
