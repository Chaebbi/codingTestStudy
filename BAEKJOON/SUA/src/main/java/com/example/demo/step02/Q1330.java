package com.example.demo.step02;

import java.util.Scanner;

public class Q1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(">");
        }
        else if(a < b) {
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }

        sc.close();
    }
}