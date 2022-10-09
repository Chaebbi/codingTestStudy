package com.example.demo.sel300;

import java.util.Scanner;

public class Q1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean arr[] = new boolean[b + a];
        arr[0] = true;
        arr[1] = true;

        for(int i = 2; i <= Math.sqrt(b + 1); i++) {
            for(int j = i * i; j < b + 1; j += i) {
                arr[j] = true;
            }
        }

        for(int i = a; i < b + 1; i++) {
            if(arr[i] == false) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
