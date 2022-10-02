package sec07;

import java.util.*;

// 경로탐색(DFS) : 인접행렬
// 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력
public class Main12 {
    static int n, m, ans = 0;
    static int[][] graph;
    static int[] ch;
    public void DFS(int v) {
        // n번 노드면
        if(v == n) ans++;
        else {
            for(int i=1; i <= n; i++) {
                // 간선이 있고, 방문 안한 곳으로 이동
                if(graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;  //다시 back해서 온 거니까 1로 체크해준거 해제
                }
            }
        }
    }
    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for(int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.print(ans);
    }
}
