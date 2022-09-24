package com.example.demo.step08;

import java.util.Scanner;

public class Q2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean arr[] = new boolean[b + 1];

        arr[0] = true; arr[1] = true;

        for(int i = 2; i <= Math.sqrt(b + 1); i++) {
            for(int j = i * i; j < b + 1; j += i) {
                arr[j] = true;
            }
        }

        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = a; i < b + 1; i++) {
            if(!arr[i]) {
                if(min > i) {
                    min = i;
                }
                sum += i;
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

        sc.close();
    }
}
