package com.example.demo.SECTION06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        // 오름차순으로 정렬하기 위해 작은 거에서 큰 거 빼면 무조건 음수를 리턴하는 걸 이용하여 로직을 짬
        if(this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}

public class Q07 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        ArrayList<Point> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr); // compareTo에 의해서 작은 거일 경우 마이너스값이니까 오름차순으로 정렬됨
        for(Point o : arr) {
            System.out.println(o.x + " " + o.y);
        }
    }
}
