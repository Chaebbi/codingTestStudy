package sec07;

import java.util.Scanner;

// 피보나치 수열 : 피보나치 수열의 항의 수를 입력받고 출력 - 재귀 이용
public class Main4 {
    /*public int DFS(int n) {
        if(n == 1) return 1;
        else if(n==2) return 1;
        else return DFS(n-1) + DFS(n-2);
    }

    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int i=1; i<=n; i++) System.out.print(T.DFS(i) + " ");
    }*/

    // 또 다른 방법
    static int[] fibo;
    public int DFS(int n){
        if(fibo[n]>0) return fibo[n];
        if(n==1) return fibo[n]=1;
        else if(n==2) return fibo[n]=1;
        else return fibo[n]=DFS(n-2)+DFS(n-1);
    }

    public static void main(String[] args){
        Main4 T = new Main4();
        int n=5;
        fibo=new int[n+1];
        T.DFS(n);
        for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
    }


}
