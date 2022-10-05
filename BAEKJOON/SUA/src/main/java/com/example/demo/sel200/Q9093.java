package com.example.demo.sel200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String arr[] = br.readLine().split(" ");
            for(int j = 0; j < arr.length; j++) {
                StringBuilder sb = new StringBuilder(arr[j]);
                System.out.print(sb.reverse() + " ");
            }
            System.out.println();
        }
    }
}
