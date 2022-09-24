package com.example.demo.step08;

import java.util.Scanner;

public class Q1978 {
    static boolean isPrime(int m) {
        if(m == 1) {
            return false;
        }

        int l = 2;
        while(l < m) {
            if(m % l == 0) {
                return false;
            }
            l++;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if(isPrime(m)) {
                cnt++;
            }
        }
        System.out.println(cnt);

        sc.close();
    }
}
