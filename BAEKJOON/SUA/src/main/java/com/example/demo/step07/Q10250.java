package com.example.demo.step07;

import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i  = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            int a = (n / h) + 1;
            int b = n % h;
            if(n % h == 0) {
                a = n / h;
                b = h;
            }
            System.out.println(b * 100 + a);
        }

        sc.close();
    }
}