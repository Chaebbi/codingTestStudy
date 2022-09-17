package com.example.demo.step04;

import java.util.Scanner;

public class Q4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int[] score = new int[a];
            double sum = 0.0;
            for(int j = 0; j < a; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }

            double avg = sum / a;
            int cnt = 0;
            for(int j = 0; j < a; j++) {
                if(score[j] > avg) {
                    cnt++;
                }
            }

            String percent = String.format("%.3f", ((double)cnt / a) * 100);
            System.out.println(percent + "%");
        }

        sc.close();
    }
}