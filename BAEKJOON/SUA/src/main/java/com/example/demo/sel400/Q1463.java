package com.example.demo.sel400;

import java.util.Scanner;

public class Q1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1; // 1을 더한 것은 연산을 수행한 횟수 올려주는 것

            if(i % 3 == 0) {
                // 3 나누기 연산 수행한 것과 -1 연산 수행한 것 비교
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
            if(i % 2 == 0) {
                // 2 나누기 연산 ㅜ행한 것과 -1 연산 수행한 것 비교
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
        }
        System.out.println(dp[n]);

        sc.close();
    }
}
