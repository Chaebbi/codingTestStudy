package com.example.demo.sel401;

import java.io.*;
import java.util.*;

public class Q13398 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int dp1[] = new int[n];
        dp1[0] = arr[0];
        int answer = dp1[0];

        // 왼쪽->오른쪽으로 최대 연속 합을 저장
        for (int i = 1; i < n; i++) {
            dp1[i] = Math.max(dp1[i - 1] + arr[i], arr[i]);
            answer = Math.max(answer, dp1[i]);
        }

        int dp2[] = new int[n];
        dp2[n - 1] = arr[n - 1];

        // 왼쪽->오른쪽으로 최대 연속 합을 저장
        for (int i = n - 2; i >= 0; i--) {
            dp2[i] = Math.max(dp2[i + 1] + arr[i], arr[i]);
        }

        // 특정 값이 지워졌다고 가정하여 오른쪽 방향과 왼쪽 방향의 최대 연속 합을 더함
        // 더한 값과 answer를 비교하여 더 큰 값으로 교체
        for (int i = 1; i < n - 1; i++) {
            int temp = dp1[i - 1] + dp2[i + 1];
            answer = Math.max(answer, temp);
        }

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}