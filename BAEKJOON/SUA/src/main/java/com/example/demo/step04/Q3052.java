package com.example.demo.step04;

import java.util.*;

public class Q3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int cnt = 0;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if(!list.contains(n % 42)) {
                list.add(n % 42);
                cnt++;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}