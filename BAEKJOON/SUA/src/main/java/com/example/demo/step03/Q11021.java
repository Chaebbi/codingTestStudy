package com.example.demo.step03;

import java.util.Scanner;

public class Q11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 0;

        for(int i = 1; i <= n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println("Case #" + i + ": " + (a + b));
        }

        sc.close();
    }
}
