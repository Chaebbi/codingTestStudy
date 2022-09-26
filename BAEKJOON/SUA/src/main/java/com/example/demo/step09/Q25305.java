package com.example.demo.step09;

import java.util.*;

public class Q25305 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer arr[]=new Integer[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[m - 1]);

        sc.close();
    }
}
