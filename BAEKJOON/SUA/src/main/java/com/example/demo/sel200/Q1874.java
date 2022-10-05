package com.example.demo.sel200;

import java.util.Scanner;
import java.util.Stack;

public class Q1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();
        int start = 0;

        while(n > 0) {
            int a = sc.nextInt();
            if(a > start) {
                for(int i = start + 1; i <= a; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = a;
            } else if(stack.peek() != a) { // 스택에 넣어졌어야 했는데 다른 경우
                System.out.println("NO"); // 수열을 만족하지 못하는 것임
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
            n--;
        }

        System.out.println(sb);
        sc.close();
    }
}
