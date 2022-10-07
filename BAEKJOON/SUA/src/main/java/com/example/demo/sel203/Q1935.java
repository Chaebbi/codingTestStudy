package com.example.demo.sel203;

import java.util.Scanner;
import java.util.Stack;

public class Q1935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Double> stack = new Stack<>();
        int n = sc.nextInt();
        sc.nextLine();

        double arr[] = new double[n];
        String str = sc.nextLine();

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(char c : str.toCharArray()) {
            if(c >= 'A' && c <= 'Z') {
                stack.push(arr[c - 'A']);
            } else if(c == '*') {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(a * b);
            } else if(c == '+') {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(a + b);
            } else if(c == '-') {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(b - a);
            } else if(c == '/') {
                double a = stack.pop();
                double b = stack.pop();
                stack.push(b / a);
            }
        }
        double answer = stack.pop();
        System.out.print(String.format("%.2f", answer));

        sc.close();
    }
}
