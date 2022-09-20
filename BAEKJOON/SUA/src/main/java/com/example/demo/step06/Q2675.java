package com.example.demo.step06;

import java.util.Scanner;

class Q2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t;
        char[] arr;

        for(int i = 0; i < n; i++){
            t = sc.nextInt();
            arr = sc.next().toCharArray();

            for(int j = 0; j < arr.length; j++){
                for(int k = 0; k < t; k++){
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}