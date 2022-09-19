package com.example.demo.step05;

import java.util.Scanner;

public class Q1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        for(int i = 1; i <= n; i++) {
            if(i / 100 >= 1) {
                a = i / 100;
                b = (i % 100) / 10;
                c = (i % 100) % 10;

                if((b - a) == (c - b)) {
                    cnt++;
                }
            } else {
                cnt++;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}
