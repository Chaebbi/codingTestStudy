package com.example.demo.sel500;

import java.util.Scanner;

public class Q1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();

        int answer = 0;
        while(true) {
            answer++;
            if((answer - e) % 15 == 0 && (answer - s) % 28 == 0 && (answer - m) % 19 == 0)  {
                break;
            }
        }
        System.out.print(answer);

        sc.close();
    }
}
