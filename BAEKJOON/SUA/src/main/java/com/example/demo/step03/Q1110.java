package com.example.demo.step03;

import java.util.Scanner;

public class Q1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nn = n;
        int cnt = 0;
        int a = 0;
        int b = 0;

        while(true) {
            a = nn / 10;
            b = nn % 10;

            nn = b * 10 + (a + b) % 10;
            cnt++;

            if(nn == n)  {
                break;
            }
        }
        System.out.println(cnt);

        sc.close();
    }
}
