package sec07;

import java.util.*;

//송아지 찾기 1(BFS : 상태트리탐색)
// 좌표 점으로 주어진 송아지 위치- 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동
// 현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동 가능
// 최소 몇번의 점프로 송아지 위치까지 가는가 ==> '최단 거리 알고리즘'
public class Main8 {
    int ans = 0;
    int[] dist = {1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e){
        ch = new int[10001]; // 좌표 경계
        ch[s] = 1;             //check 배열
        Q.offer(s);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                //if(x == e) return L;        // 찾는값이면 return
                for (int j = 0; j < 3; j++) {
                    int nx = x + dist[j];   //3개의 노드 생성
                    if(x == e) return L;        // 찾는값이면 return
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) { //방문여부 검사 + 좌표경계 검사
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main8 T = new Main8();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();   //현수 위치
        int e = kb.nextInt();   //송아지 위치
        System.out.print(T.BFS(s,e));
    }
}
