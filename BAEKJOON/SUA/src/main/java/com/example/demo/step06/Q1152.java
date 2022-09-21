package com.example.demo.step06;

import java.util.Scanner;

public class Q1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 문자열 앞뒤 공백 제거
        String str = sc.nextLine().trim();

        int cnt = 0;
        int wcnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str != null && str.charAt(0) != ' ') {
                if (str.charAt(i) == ' ') {
                    cnt++;
                } else if (str != null && str.charAt(i) != ' ') {
                    wcnt = 1;
                }
            }
        }
        if (cnt > 0) {
            wcnt = cnt + 1;
        }
        System.out.println(wcnt);

        sc.close();
    }
}