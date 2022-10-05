package sec08;

import java.util.Scanner;

// 조합의 경우수(메모이제이션)
public class Main7 {
    int[][] dy = new int[35][35];
    /* 비효율!
    public int DFS(int n, int r) {
        if(n == r || r ==0) return 1;
        else return DFS(n-1, r-1) + DFS(n-1, r);
    }*/
    public int DFS(int n, int r) {
        // 이미 갔다왔던 식인지 확인하기 ==> 메모이제이션
        if(dy[n][r] > 0) return dy[n][r];

        if(n == r || r ==0) return 1;
        else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }

    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(T.DFS(n,r));

    }
}
