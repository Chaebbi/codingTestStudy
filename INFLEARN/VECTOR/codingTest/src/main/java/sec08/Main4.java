package sec08;

import java.util.Scanner;

// 이전까지는 이진트리로 한다 안한다 두개의 선택. 이번부터는 호출이 여러번 (중복을 허락해서 n번)
// 중복순열 구하기: 중복을 허락하여 M번을 뽑아 일렬로 나열 /하는 방법을 모두 출력
public class Main4 {
    static int[] pm;
    static int n, m;
    public void DFS(int L) {
        if(L == m) {
            for(int x : pm) System.out.print(x +" ");
            System.out.println();

        } else {
            // 두가닥이 아니라 n가닥 뻗으므로 for문
            for(int i=1; i<=n; i++) {
                pm[L] = i;
                DFS(L+1);   //DFS가 n번 호ㅜ출
            }

        }
    }
    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();   //1부터 n까지 번호 구슬
        m = kb.nextInt();   //뽑는 횟수(중복 가능 )
        pm = new int[m];
        T.DFS(0);
    }
}
