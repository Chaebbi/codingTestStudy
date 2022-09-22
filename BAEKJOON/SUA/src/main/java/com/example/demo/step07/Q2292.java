package com.example.demo.step07;

import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 1;
        int d = 6;
        int answer = 1;

        for(int i = 0; i < n; i++) {
            if(max >= n) {
                break;
            }
            max += d;
            d += 6; // 6의 배수씩 커짐
            answer++;
        }
        System.out.println(answer);

        sc.close();
    }
}