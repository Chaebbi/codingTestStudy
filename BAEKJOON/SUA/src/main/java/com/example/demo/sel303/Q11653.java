package com.example.demo.sel303;

import java.util.Scanner;

public class Q11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 2;

        while (n >= i){
            if(n % i == 0){
                System.out.println(i);
                n /= i;
            } else {
                i++;
            }
        }

        sc.close();
    }
}