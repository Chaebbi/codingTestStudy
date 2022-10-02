package sec07;

import java.util.Scanner;

// 팩토리얼 : 재연수 n입력되면 n! 구하는 프로그램 - 재귀이용
public class Main3 {
    public int DFS(int n) {
        if(n == 1) return 1;
        else return n * DFS(n-1);
    }
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.DFS(n));
    }
}
