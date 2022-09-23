package com.example.demo.step07;

import java.util.Scanner;

public class Q2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int k;
        int n;

        for(int i = 0; i < t; i++) {
            k = sc.nextInt();
            n = sc.nextInt();
            int[] floor = new int[n];

            for(int j = 0; j <= k; j++) {
                for(int m = 0; m < n; m++) {
                    if(j == 0) {
                        if(m == 0) {
                            floor[m] = 1;
                        }
                        else {
                            floor[m] = m + 1;
                        }
                    }
                    else {
                        if(m > 0) {
                            floor[m] = floor[m] + floor[m - 1];
                        }
                    }
                }
            }
            System.out.println(floor[n - 1]);
        }

        sc.close();
    }
}