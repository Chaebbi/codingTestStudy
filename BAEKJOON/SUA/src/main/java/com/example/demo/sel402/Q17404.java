package com.example.demo.sel402;

import java.io.*;
import java.util.*;

public class Q17404 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n + 1][3];
        int dp[][] = new int[n + 1][3];
        int INF = 1_000 * 1_000;
        int answer = INF;

        for(int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(j == i) {
                    dp[1][j] = arr[1][j];
                } else {
                    dp[1][j] = INF;
                }
            }

            for(int j = 2; j<= n; j++) {
                dp[j][0] = Math.min(dp[j - 1][1], dp[j - 1][2]) + arr[j][0];
                dp[j][1] = Math.min(dp[j - 1][0], dp[j - 1][2]) + arr[j][1];
                dp[j][2] = Math.min(dp[j - 1][0], dp[j - 1][1]) + arr[j][2];
            }

            for(int j = 0; j < 3; j++) {
                if(j != i) {
                    answer = Math.min(answer, dp[n][j]);
                }
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
