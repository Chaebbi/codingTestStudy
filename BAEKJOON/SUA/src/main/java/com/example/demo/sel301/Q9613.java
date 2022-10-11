package com.example.demo.sel301;

import java.util.*;

public class Q9613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int arr[] = new int[a];
            for (int j = 0; j < a; j++) {
                arr[j] = sc.nextInt();
            }
            long sum = 0;
            // 1, 2 / 2, 3 / 3, 4 이런 형태의 매개변수로 gcd 호출
            for (int k = 0; k < a - 1; k++) {
                for (int m = k + 1; m < a; m++) {
                    sum += gcd(arr[k], arr[m]);
                }
            }
            System.out.println(sum);
        }

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