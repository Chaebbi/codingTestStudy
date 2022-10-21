package com.example.demo.sel401;

import java.util.*;
import java.io.*;

public class Q11722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int dp[] = new int[n + 1];
        int arr[] = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for(int i = 1; i <= n; i++) {
            dp[i] = 1;
            for(int j = 1; j < i; j++) {
                if(arr[j] > arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}