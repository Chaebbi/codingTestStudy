package com.example.demo.sel300;

import java.util.Scanner;

public class Q10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fact(sc.nextInt()));
        sc.close();
    }

    public static int fact(int n) {
        if (n <= 1)
            return 1;
        else
            return fact(n - 1) * n;
    }

}