package com.example.demo.step06;

import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }

        for(int a : arr) {
            System.out.print(a + " ");
        }

        sc.close();
    }
}