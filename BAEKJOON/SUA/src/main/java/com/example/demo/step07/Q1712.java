package com.example.demo.step07;

import java.util.Scanner;

class Q1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(b >= c){ // 1대를 만드는 금액이 1대를 파는 금액보다 크면 안됨
            System.out.println("-1");
        }
        else{
            System.out.println(a / (c - b) + 1);
        }
    }
}