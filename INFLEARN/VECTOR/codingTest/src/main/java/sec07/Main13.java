package sec07;

import java.util.*;

// 경로탐색(DFS) : 인접리스트 (12는 인접행렬로 풀었었음)
public class Main13 {
    static int n, m, ans = 0;
    static ArrayList<ArrayList<Integer>> graph; // arraylist를 저장하는 arraylist
    static int[] ch;
    public void DFS(int v){
        if(v == n) ans++;
        else {
            for(int nv : graph.get(v)) {    //v 노드의 연결정보로 forEach
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }

    }
    public static void main(String[] args) {
        Main13 T = new Main13();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++) {   //정점의 수만큼 새 arraylist 객체 생성
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i=0; i<m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);    // 각 node에 add해서 연결정보 추가
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.print(ans);
    }

}
