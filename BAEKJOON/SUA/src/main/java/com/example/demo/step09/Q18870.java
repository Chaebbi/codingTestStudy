package com.example.demo.step09;

import java.util.*;

public class Q18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] sarr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < n; i++) {
            sarr[i] = arr[i] = sc.nextInt();
        }
        Arrays.sort(sarr);

        int r = 0;
        for(int a : sarr) {
            if(!map.containsKey(a)) {
                map.put(a, r);
                r++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int a : arr) {
            int rank = map.get(a);
            sb.append(rank).append(' ');
        }
        System.out.println(sb);

        sc.close();
    }
}