package com.example.demo.sel200;

import java.util.Scanner;
import java.util.Stack;

public class Q10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String str = sc.next();

            if(str.contains("push")) {
                stack.push(sc.nextInt());
            } else if(str.equals("pop")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else if(str.equals("top")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            } else if(str.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if(str.equals("size")) {
                sb.append(stack.size()).append("\n");
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
