package com.example.demo.sel200;

import java.util.Scanner;
import java.util.Stack;

public class Q9012 {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            } else {
                // 닫는 괄호가 많은 상황
                if(stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        // 여는 괄호가 많은 상황
        if(!stack.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Q9012 m = new Q9012();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println(m.solution(sc.next()));
        }
    }
}
