package com.example.demo.step01;

import java.util.Scanner;

public class Q3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1, 1, 2, 2, 2, 8};
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] - sc.nextInt() + " ");
        }
    }
}