package com.example.demo.step03;

import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;

        while(true) {
            a = sc.nextInt();
            b = sc.nextInt();

            if(a == 0 && b == 0) {
                break;
            } else {
                System.out.println(a + b);
            }
        }

        sc.close();
    }
}