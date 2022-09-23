package com.example.demo.SECTION08;

import java.util.*;

class Point4 {
    public int x, y;
    Point4(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Q15 {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point4> hs, pz;

    public void DFS(int L, int s) {
        if(L == m) {
            int sum = 0;
            for(Point4 h : hs) {
                int dis = Integer.MAX_VALUE;
                for(int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer=Math.min(answer, sum);
        }
        else {
            for(int i = s; i < len; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Q15 T = new Q15();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int tmp = kb.nextInt();
                if(tmp == 1) {
                    hs.add(new Point4(i, j));
                }
                else if(tmp == 2) {
                    pz.add(new Point4(i, j));
                }
            }
        }
        len = pz.size();
        combi = new int[m];
        T.DFS(0, 0);
        System.out.println(answer);
    }
}