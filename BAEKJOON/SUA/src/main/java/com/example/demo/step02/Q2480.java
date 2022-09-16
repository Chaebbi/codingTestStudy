package com.example.demo.step02;

import java.util.Scanner;

public class Q2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = 0;

        if(a == b && b == c) {
            n = 10000 + a * 1000;
        } else if(a == b || b == c) {
            n = 1000 + b * 100;
        } else if(c == a) {
            n = 1000 + a * 100;
        } else {
            n = Math.max(Math.max(a, b), c) * 100;
        }
        System.out.println(n);

        sc.close();
    }
}
