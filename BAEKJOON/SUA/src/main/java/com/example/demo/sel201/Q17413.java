package com.example.demo.sel201;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class Q17413 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();
        String str = sc.nextLine() + " "; // 마지막 단어도 뒤집을 수 있게
        boolean isCheck = false; // < 과 >의 사이에 존재 여부

        for(char c : str.toCharArray()) {
            if(c == '<') {
                while(!stack.isEmpty()) {
                    bw.write(stack.pop());
                }
                bw.write(c);
                isCheck = true;
            } else if(c == '>') {
                bw.write(c);
                isCheck = false;
            } else if(isCheck) {
                bw.write(c);
            } else { // 뒤집어야 할 문자열인 경우
                if(c == ' ' || c == '\n') { // 단어의 끝이라면
                    while(!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(c);
                } else {
                    stack.push(c);
                }
            }
        }
        bw.flush();

        sc.close();
    }
}
