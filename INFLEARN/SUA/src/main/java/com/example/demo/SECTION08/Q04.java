package com.example.demo.SECTION08;

import java.util.*;

public class Q04 {
    static int[] pm;
    static int n, m;

    public void DFS(int L){
        if(L == m){
            for(int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else{
            for(int i = 1; i <= n; i++){
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args){
        Q04 T = new Q04();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}