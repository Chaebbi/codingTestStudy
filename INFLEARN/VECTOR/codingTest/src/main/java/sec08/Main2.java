package sec08;

import java.util.Scanner;

// 바둑이 승차(DFS) : N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램
public class Main2 {
    static int ans = Integer.MIN_VALUE;
    static int n, w;

    public void DFS(int L, int sum, int[] arr) {
        if(sum > n) return;
        if(L==w) {
            ans = Math.max(ans, sum);

        } else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }

    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        w = kb.nextInt();
        int[] arr = new int[w];
        for (int i = 0; i < w; i++) {
            arr[i] = kb.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(ans);

    }
}
