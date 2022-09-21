package com.example.demo.step06;

import java.util.Scanner;

public class Q2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] ca = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        for(int i = 0; i < ca.length; i++) {
            str = str.replace(ca[i], "c");
        }

        System.out.println(str.length());

        sc.close();
    }
}
