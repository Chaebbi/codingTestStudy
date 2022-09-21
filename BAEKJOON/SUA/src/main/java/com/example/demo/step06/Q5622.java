package com.example.demo.step06;

import java.util.Scanner;

public class Q5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int t = 0;
        char c;

        for(int i = 0; i < str.length(); i++) {
            c = str.charAt(i);

            if(c >= 'A' && c <= 'C') {
                t += 3;
            } else if(c >= 'D' && c <= 'F') {
                t += 4;
            } else if(c >= 'G' && c <= 'I') {
                t += 5;
            } else if(c >= 'J' && c <= 'L') {
                t += 6;
            } else if(c >= 'M' && c <= 'O') {
                t += 7;
            } else if(c >= 'P' && c <= 'S') {
                t += 8;
            } else if(c >= 'T' && c <= 'V') {
                t += 9;
            } else if(c >= 'W' && c <= 'Z') {
                t += 10;
            }
        }

        System.out.println(t);

        sc.close();
    }
}
