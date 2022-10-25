package com.example.demo.sel500;

import java.util.Scanner;

public class Q6064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int s = 0; s < t; s++) {
            boolean answer = false;
            int m = sc.nextInt();
            int n = sc.nextInt();
            int x = sc.nextInt() - 1; // 나머지 값이 0이 나오는 것을 미리 방지
            int y = sc.nextInt() - 1;

            for (int i = x; i < (n * m); i += m) {
                if (i % n == y) {
                    System.out.println(i + 1);
                    answer = true;
                    break;
                }
            }

            if (!answer) {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}