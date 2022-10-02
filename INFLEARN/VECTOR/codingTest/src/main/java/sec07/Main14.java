package sec07;

// 14. 그래프 최단거리(BFS)
import java.util.*;
public class Main14 {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;
    public void BFS(int v) {
        Queue<Integer> Q = new LinkedList();
        ch[v] = 1;
        dis[v] = 0; //출발지점
        Q.offer(v);
        while(!Q.isEmpty()) {
            int cv = Q.poll();      //현재 정점
            for(int nv : graph.get(cv)) {   //인접리스트
                if(ch[nv] == 0) {
                    ch[nv] =1;
                    Q.offer(nv);
                    dis[nv] = dis[cv] + 1;

                }
            }
        }
    }
    public static void main(String args[]) {
        Main14 T = new Main14();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        dis = new int[n+1];
        for(int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for(int i=2; i<=n; i++) {
            System.out.println(i+" : "+dis[i]);
        }
    }
}
