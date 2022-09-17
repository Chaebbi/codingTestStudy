package com.example.demo.step04;

import java.util.Scanner;

public class Q8958 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String str = sc.next();
            int sum = 0;
            int cnt = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'O') {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }

        sc.close();
    }
}