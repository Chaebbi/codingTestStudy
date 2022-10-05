package sec08;

import java.util.Scanner;
// 최대점수 구하기(DFS) : 제한시간 M안에 N개의 문제 중 얻을 수 있는 최대점수
public class Main3 {
    static int ans = Integer.MIN_VALUE;
    static int n, m;

    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        // 제한시간 넘어간다
        if(time>m) return;
        if(L == n) {
            ans = Math.max(ans, sum);
        } else {
            // 푼다 : sum+ps[L] 점 , time+pt[L] 시간
            DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);    // 못푼다
        }

    }

    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();   // 문제개수
        m = kb.nextInt();   // 제한시간
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();  //점수
            b[i] = kb.nextInt(); //제한시간
        }
        T.DFS(0, 0, 0, a, b);
        System.out.println(ans);

    }
}
