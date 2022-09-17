package com.example.demo.step03;

import java.util.Scanner;

public class Q10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if(arr[i] < a) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}