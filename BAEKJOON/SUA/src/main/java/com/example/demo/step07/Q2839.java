package com.example.demo.step07;

import java.util.Scanner;

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 0;

        while(n % 5 != 0 && n > 0) {
            n -= 3;
            b++;
        }
        a = n / 5;
        n = n % 5;

        if(n < 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(a + b);
        }

        sc.close();
    }

}