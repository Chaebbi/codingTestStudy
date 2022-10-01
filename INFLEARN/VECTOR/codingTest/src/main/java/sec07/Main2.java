package sec07;

import java.util.Scanner;

// 재귀함수 이용한 이진수출력 : 10진수 N 입력되면 2진수로 변환되는 프로그램 - 재귀 함수 이용
public class Main2 {
    public void DFS(int n) {
        if(n == 0) return;
        else {
            DFS(n/2);
            System.out.print(n%2); // 1 2 3 출력
        }
    }
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.DFS(n);
    }
}
