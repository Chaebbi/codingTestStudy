package com.example.demo.sel200;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1158 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<Integer>();

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }
        sb.append("<");

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < k - 1; j++) {
                queue.add(queue.poll());
            }
            sb.append(queue.poll() + ", ");
        }
        sb.setLength(sb.length() - 2); // 마지막 , 지우기
        sb.append(">");
        System.out.println(sb.toString());

        sc.close();
    }
}
