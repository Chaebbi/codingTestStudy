package sec05;

import java.util.*;

// [큐FIFO] 공주구하기 :
public class Main6 {
    public int solution(int n, int k){
        int ans = 0;
        Queue<Integer> queue =new LinkedList<>();
        for(int i=1; i<=n; i++) queue.offer(i);
        while(!queue.isEmpty()) {
            for(int i=1; i<k; i++) queue.offer(queue.poll());
            queue.poll();
            if(queue.size() == 1) ans = queue.poll();
        }
        return ans;
    }

    public static void main(String[] args){
        Main6 T = new Main6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(T.solution(n, k));

    }
}
