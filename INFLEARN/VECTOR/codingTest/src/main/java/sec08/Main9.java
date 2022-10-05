package sec08;

import java.util.Scanner;

// 1부터 N까지 번호가 적힌 구슬 중 M개를 뽑는 방법의 수
public class Main9 {
    static int[] combi;
    static int n, m;

    public void DFS(int L, int s) {
        if (L == m) {
            for(int x : combi) System.out.print(x + " ");
            System.out.println();

        } else {
            for(int i=s; i<=n; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }

    }

    public static void main(String[] args) {
        Main9 T = new Main9();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        int[] arr = new int[n];
        combi = new int[m];
        T.DFS(0, 1);

    }
}
