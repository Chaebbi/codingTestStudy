package com.example.demo.step08;

import java.util.Scanner;

public class Q9020 {
    static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int d;
            int r;
            d = n / 2;
            r = n - d;

            while(true) {
                if(isPrime(d) && isPrime(r)) {
                    break;
                } else {
                    d--;
                    r++;
                }
            }
            System.out.println(d + " " + r);
        }
    }
}
