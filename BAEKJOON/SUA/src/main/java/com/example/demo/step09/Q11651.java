package com.example.demo.step09;

import java.util.*;

class Point2 implements Comparable<Point2> {
    public int x, y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point2 o) {
        if(this.y == o.y) {
            return this.x - o.x;
        }
        return this.y - o.y;
    }
}

public class Q11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Point2> arr = new ArrayList<Point2>();

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point2(x, y));
        }
        Collections.sort(arr);

        for(Point2 p : arr) {
            System.out.println(p.x + " " + p.y);
        }

        sc.close();
    }
}