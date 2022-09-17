package com.example.demo.step04;

import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int index = -1;

        for(int i = 0; i < 9; i++) {
            int n = sc.nextInt();
            if(max < n) {
                max = n;
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);

        sc.close();
    }
}