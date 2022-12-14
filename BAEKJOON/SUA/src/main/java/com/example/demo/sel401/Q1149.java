package com.example.demo.sel401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];
        int[][] dp = new int[n][3];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 1번째 집에 대한 데이터 추가
        for(int j = 0; j < 3; j++) {
            dp[0][j] = arr[0][j];
        }

        // 2번째 집 이후부터의 dp 계산
        for(int i = 1; i < n; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + arr[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + arr[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + arr[i][2];
        }

        // 모두 칠한 뒤에 최저 비용 구하기
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 3; i++) {
            if(dp[n - 1][i] < min) {
                min = dp[n - 1][i];
            }
        }
        System.out.println(min);
    }
}