package com.example.demo.step03;

import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 0;

        for(int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
        }

        sc.close();
    }
}