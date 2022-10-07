package com.example.demo.sel203;

import java.io.*;
import java.util.Stack;

public class Q1918 {
    static StringBuilder sb = new StringBuilder();

    static int priority(char c) {
        if(c == '(') {
            return 0;
        }
        if(c == '+' || c == '-') {
            return 1;
        }
        return 2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if(c >= 'A' && c <= 'Z') {
                sb.append(c);
            } else if(c == '(') {
                stack.push(c);
            } else if(c == ')') {
                while(!stack.isEmpty()) {
                    if(stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                    sb.append(stack.pop());
                }
            } else { // 연산자일 경우
                while(!stack.isEmpty() && priority(stack.peek()) >= priority(c)) {
                    sb.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
