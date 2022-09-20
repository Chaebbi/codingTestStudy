package com.example.demo.step06;

import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        String str = sc.nextLine().toUpperCase();
        int max = 0;
        char c = 'a';

        for(int i =0; i < str.length(); i++) {
            arr[str.charAt(i) - 65]++;
            if (max < arr[str.charAt(i) - 65]) {
                max = arr[str.charAt(i) - 65];
                c = str.charAt(i);
            } else if(max == arr[str.charAt(i) - 65]){
                c = '?';
            }
        }
        System.out.println(c);
    }
}