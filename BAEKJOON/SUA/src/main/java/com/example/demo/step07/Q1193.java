package com.example.demo.step07;

import java.util.Scanner;

public class Q1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int r = 0;

        for(int i = 1; a < n; i++) {
            a += i;
            r += 1;
        }

        int d = a - n;  // 차이를 계산해서 몇번째인지 계산하기 위함

        if(r % 2 == 0) { // 짝수인 경우 위에서 아래로 이동
            System.out.print((r - d) + "/" + (d + 1));
        } else { // 홀수인 경우 아래에서 위로 이동
            System.out.print((d + 1) + "/" + (r - d));
        }

        sc.close();
    }
}
