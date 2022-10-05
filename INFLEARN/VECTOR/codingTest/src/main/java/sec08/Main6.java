package sec08;

import java.util.*;

// 1부터 N까지 번호가 적힌 구슬 중 중복을 허락하여 M번을 뽑아 일렬로 나열하는 방법을 모두 출력
public class Main6 {
    static int[] pm, ch, arr;
    static int n, m;

    public void DFS(int L) {
        if (L == m) {
            for(int x : pm) {
                System.out.print(x + " ");
            } System.out.println();
        } else {
            for(int i=0; i<n; i++) {
                // 체크가 안되어있으면 == 안쓰였으면 check
                if(ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1);
                    //갔다와서 back하는 지점
                    ch[i]=0;    //check 풀어주기
                }
            }
        }
    }

    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        ch = new int[n];
        pm = new int[m];
        T.DFS(0);
    }
}
