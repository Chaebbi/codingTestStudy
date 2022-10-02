package sec07;

import java.util.Scanner;

// 재귀함수 : 자연수 n 이 입력되면 재귀함수 이용, 1~n까지 출력하는 프로그램
public class Main1 {
    public void DFS(int n) {
        if(n == 0) return;
        else {
//            System.out.print(n + " "); // 3 2 1 출력
            DFS(n - 1);
            System.out.print(n + " "); // 1 2 3 출력
        }
    }
    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.DFS(n);
    }
}
