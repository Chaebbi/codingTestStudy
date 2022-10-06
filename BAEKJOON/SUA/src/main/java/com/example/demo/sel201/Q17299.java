package com.example.demo.sel201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q17299 {
    static final int MAX = 1_000_001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int cnt[] = new int[MAX];
        int index[] = new int[n];
        int answer[] = new int[n];

        for(int i = 0; i < n; i++) {
            index[i] = Integer.parseInt(st.nextToken());
            cnt[index[i]]++;
        }

        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && cnt[index[i]] > cnt[index[stack.peek()]]) {
                answer[stack.pop()] = index[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        for(int i = 0; i< n; i++) {
            sb.append(answer[i]).append(' ');
        }
        System.out.println(sb.toString());
    }
}
