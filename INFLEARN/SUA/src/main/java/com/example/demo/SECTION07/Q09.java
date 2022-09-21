package com.example.demo.SECTION07;


class Node9 {
    int data;
    Node9 lt, rt;
    public Node9(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Q09 {
    Node9 root;
    public int DFS(int L, Node9 root) {
        if(root.lt == null && root.rt == null) {
            return L;
        } else {
            return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
        }
    }

    public static void main(String[] args) {
        Q09 tree = new Q09();
        tree.root = new Node9(1);
        tree.root.lt = new Node9(2);
        tree.root.rt = new Node9(3);
        tree.root.lt.lt = new Node9(4);
        tree.root.lt.rt = new Node9(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}