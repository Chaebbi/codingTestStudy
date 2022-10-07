package com.example.demo.sel203;

import java.util.Scanner;

public class Q10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int arr[] = new int[26];

        for(char c : str.toCharArray()) {
            arr[(int)c - 'a']++;
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
