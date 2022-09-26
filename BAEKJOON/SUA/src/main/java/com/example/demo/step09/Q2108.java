package com.example.demo.step09;

import java.util.Scanner;

public class Q2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[8001];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int med = 10000;
        int mod = 10000;

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sum += a;
            arr[a + 4000]++;

            if(a > max) {
                max = a;
            }
            if(a < min) {
                min = a;
            }
        }

        int cnt = 0;
        int modMax = 0;
        boolean flag = false;

        for(int i = min + 4000; i <= max + 4000; i++) {
            if(arr[i] > 0) {
                if(cnt < (n + 1)/ 2) {
                    cnt += arr[i];
                    med = i - 4000;
                }

                if(modMax < arr[i]) {
                    modMax = arr[i];
                    mod = i - 4000;
                    flag = true;
                } else if(modMax == arr[i] && flag == true) {
                    mod = i - 4000;
                    flag = false;
                }
            }
        }

        System.out.println((int) Math.round((double) sum / n));
        System.out.println(med);
        System.out.println(mod);
        System.out.println(max - min);

        sc.close();
    }
}
