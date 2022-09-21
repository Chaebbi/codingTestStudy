package com.example.demo.SECTION07;

import java.util.LinkedList;
import java.util.Queue;

class Node10 {
    int data;
    Node10 lt, rt;
    public Node10(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Q10 {
    Node10 root;
    public int BFS(Node10 root) {
        Queue<Node10> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i = 0; i < len; i++) {
                Node10 cur = Q.poll();
                if(cur.lt == null && cur.rt == null) {
                    return L;
                }
                if(cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if(cur.rt != null) {
                    Q.offer(cur.rt);
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Q10 tree = new Q10();
        tree.root = new Node10(1);
        tree.root.lt = new Node10(2);
        tree.root.rt = new Node10(3);
        tree.root.lt.lt = new Node10(4);
        tree.root.lt.rt = new Node10(5);
        System.out.println(tree.BFS(tree.root));
    }
}