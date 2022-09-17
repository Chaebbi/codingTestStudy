package com.example.demo.step04;

import java.util.Scanner;

public class Q10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a < min) {
                min = a;
            }
            if(a > max) {
                max = a;
            }
        }

        System.out.println(min + " " + max);

        sc.close();
    }
}