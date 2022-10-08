package com.example.demo.sel203;

import java.util.Arrays;
import java.util.Scanner;

public class Q11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String arr[] = new String[str.length()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = str.substring(i); // i 번째부터 문자열 가져옴
        }
        Arrays.sort(arr); // 사전순으로 정렬

        for(String s : arr) {
            System.out.println(s);
        }

        sc.close();
    }
}
