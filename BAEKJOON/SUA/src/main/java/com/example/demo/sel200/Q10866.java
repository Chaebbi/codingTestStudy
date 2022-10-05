package com.example.demo.sel200;

import java.util.*;
import java.io.*;

public class Q10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");

            switch(str[0]) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(str[1]));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(str[1]));
                    break;
                case "pop_front":
                    if(deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else {
                        sb.append(deque.pollFirst()).append("\n");
                    }
                    break;
                case "pop_back":
                    if(deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else {
                        sb.append(deque.pollLast()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    if(deque.isEmpty()) {
                        sb.append(1).append("\n");
                    }
                    else {
                        sb.append(0).append("\n");
                    }
                    break;

                case "front":
                    if(deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else {
                        sb.append(deque.peekFirst()).append("\n");
                    }
                    break;
                case "back":
                    if(deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else {
                        sb.append(deque.peekLast()).append("\n");
                    }
                    break;
            }
        }

        System.out.println(sb);
    }
}