package com.example.demo.SECTION07;

public class Q03 {
    public int DFS(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        Q03 T = new Q03();
        System.out.println(T.DFS(5));
    }
}
