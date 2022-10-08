package com.example.demo.sel203;

import java.util.Scanner;

public class Q10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt(); long b = sc.nextInt();
        long c = sc.nextInt(); long d = sc.nextInt();
        long answer = (long) (a * Math.pow(10, String.valueOf(b).length()) + b + (c * Math.pow(10, String.valueOf(d).length())) + d);
        System.out.println(answer);

        sc.close();
    }
}