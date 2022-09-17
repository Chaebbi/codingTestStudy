package com.example.demo.SECTION05;

import java.util.Scanner;
import java.util.Stack;

public class Q01 {
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

    public static void main(String[] args){
        Q01 T = new Q01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}