package com.example.demo.step04;

import java.util.Scanner;

public class Q1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = -1;
        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        System.out.println(((sum / max) * 100) / n);

        sc.close();
    }
}