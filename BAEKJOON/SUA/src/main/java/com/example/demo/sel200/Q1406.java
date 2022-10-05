package com.example.demo.sel200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        Stack<Character> lStack = new Stack<>();
        Stack<Character> rStack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < str.length(); i++) {
            lStack.push(str.charAt(i));
        }

        for(int i = 0; i < n; i++) {
            String cmd = br.readLine();
            switch(cmd.charAt(0)) {
                case 'L' : // 왼쪽 스택에서 pop한 값을 오른쪽 스택에 push
                    if(lStack.empty()) {
                        break;
                    }
                    rStack.push(lStack.pop());
                    break;
                case 'D' : // 오른쪽 스택에서 pop한 값을 왼쪽 스택에 push
                    if(rStack.empty()) {
                        break;
                    }
                    lStack.push(rStack.pop());
                    break;
                case 'B' : // 왼쪽 스택 pop
                    if(lStack.empty()) {
                        break;
                    }
                    lStack.pop();
                    break;
                case 'P' : // 왼쪽 스택 push
                    lStack.push(cmd.charAt(2));
                    break;
            }
        }

        while(!lStack.empty()) {
            rStack.push(lStack.pop());
        }
        while(!rStack.empty()) {
            sb.append(rStack.pop());
        }
        System.out.println(sb.toString());
    }
}
