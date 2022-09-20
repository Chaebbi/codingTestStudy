package com.example.demo.SECTION07;

public class Q01 {
    public void DFS(int n) {
        if(n == 0) {
            return;
        } else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Q01 T = new Q01();
        T.DFS(3);
    }
}
