package com.example.demo.sel301;

import java.util.Scanner;

public class Q17087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[a];

        for(int i = 0; i < a; i++) {
            int n = sc.nextInt(); // 동생 위치
            arr[i] = Math.abs(b - n); // 나의 위치와 동생의 위치 차이
        }

        int answer = arr[0];
        for(int i = 1; i < arr.length; i++) {
            answer = gcd(answer, arr[i]); // 위치 차이들 중에서 최대공약수 구하기
        }
        System.out.println(answer);

        sc.close();
    }

    // 유클리드 호제법 이용
    static int gcd (int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
