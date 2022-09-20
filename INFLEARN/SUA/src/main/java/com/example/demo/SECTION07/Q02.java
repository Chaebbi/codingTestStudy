package com.example.demo.SECTION07;

public class Q02 {
    public void DFS(int n) {
        if(n == 0) {
            return;
        } else {
            DFS(n / 2);
            System.out.print(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        Q02 T = new Q02();
        T.DFS(11);
    }
}
