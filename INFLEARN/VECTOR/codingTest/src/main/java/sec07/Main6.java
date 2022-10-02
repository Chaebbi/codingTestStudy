package sec07;

import java.util.Scanner;

//부분집합 구하기 (DFS) : 자연수 n 주어지면 1부터 n까지 원소 갖는 집합의 부분집합 모두 출력 프로그램
public class Main6 {
    static int n;
    static int[] ch;
    public void DFS(int L){
        if(L == n+1) {
            String tmp = "";
            for(int i=1; i<=n; i++) {
                if (ch[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if(tmp.length()>0) System.out.println(tmp);
        }
        else {
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }



    }

    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner kb = new Scanner(System.in);
        n = 3;
        ch = new int[n+1];
        T.DFS(1);
    }
}
