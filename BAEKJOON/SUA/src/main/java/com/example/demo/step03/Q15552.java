package com.example.demo.step03;

import java.io.*;
import java.util.StringTokenizer;

public class Q15552 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;

            int n = Integer.parseInt(br.readLine());
            int a = 0;
            int b = 0;
            int sum = 0;

            for(int i = 0; i < n; i ++) {
                st = new StringTokenizer(br.readLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

                sum = a + b;
                bw.write(sum + "\n");
            }

            bw.flush();
            bw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}