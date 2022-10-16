package com.example.demo.sel400;

import java.util.Scanner;

public class Q9095 {
    static int cnt = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            cnt = 0;
            int t = sc.nextInt();
            dfs(t, 0);
            System.out.println(cnt);
        }
    }

    public static void dfs(int t, int n) {
        if(t < n) {
            return;
        }
        if(t == n) {
            cnt++;
            return;
        } else {
            dfs(t, n + 1);		// 더하기 1
            dfs(t, n + 2);		// 더하기 2
            dfs(t, n + 3);		// 더하기 3
        }
    }
}
