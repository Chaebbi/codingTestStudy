package com.example.demo.step02;

import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = sc.nextInt();

        int k = 60 * a + b; // 몇 시 몇 분을 분으로 변경
        k += n; // 요리에 걸린 시간 더하기

        int h = (k / 60) % 24; // 몇 시로 변경 (24시간이 넘을 경우 0시부터 시작되게)
        int m = k % 60; // 몇 분으로 변경

        System.out.println(h + " " + m);

    }
}