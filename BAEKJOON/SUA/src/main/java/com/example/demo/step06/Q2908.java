package com.example.demo.step06;

import java.util.Scanner;

public class Q2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a = (a % 10) * 100 + ((a % 100) / 10) * 10 + (a / 100);
        b = (b % 10) * 100 + ((b % 100) / 10) * 10 + (b / 100);

        if(a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
