package com.example.demo.step06;

import java.util.Scanner;

public class Q1316 {
    public static boolean check() {
        String str = sc.next();
        boolean[] arr = new boolean[26];
        int prev = 0;

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if(prev != now) {
                if(arr[now - 'a'] == false) {
                    arr[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(check() == true) cnt++;
        }

        System.out.println(cnt);

        sc.close();;
    }
}