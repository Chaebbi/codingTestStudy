package com.example.demo.sel300;

import java.util.*;

public class Q2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int tmp = 0; // 최대공약수

        if(b > a) {
            tmp = a;
            a = b;
            b = tmp;
        }

        for(int i = b; i > 0; i--) {
            if((a % i == 0) && (b % i == 0)) {
                tmp = i;
                break;
            }
        }

        System.out.println(tmp);
        System.out.println(tmp * (a / tmp) * (b / tmp)); // 최소공배수

        sc.close();
    }
}