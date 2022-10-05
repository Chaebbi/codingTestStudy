package com.example.demo.sel200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        int a = -1;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch(str) {
                case "push" :
                    a = Integer.parseInt(st.nextToken());
                    queue.add(a);
                    break;
                case "pop" :
                    if(queue.isEmpty()) {
                        sb.append("-1").append("\n");
                        break;
                    }
                    sb.append(queue.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                    break;
                case "back" :
                    sb.append(queue.isEmpty() ? -1 : a).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
