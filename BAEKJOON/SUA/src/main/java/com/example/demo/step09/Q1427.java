package com.example.demo.step09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Q1427 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        int rem;
        do {
            rem = a % 10;
            a = a / 10;
            arr.add(rem);
        }
        while (a > 0);

        Collections.sort(arr, Comparator.reverseOrder());

        for(int n : arr) {
            System.out.print(n);
        }

        sc.close();
    }
}