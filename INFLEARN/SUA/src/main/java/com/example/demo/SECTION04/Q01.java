package com.example.demo.SECTION04;

import java.util.HashMap;
import java.util.Scanner;

public class Q01 {
    public char solution(int n, String s) {
        char answer= ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        // System.out.println(map.containsKey('F'));
        // System.out.println(map.size());
        // System.out.println(map.remove('A'));

        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()) {
            // System.out.println(key + " " + map.get(key));
            if(map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Q01 T = new Q01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.print(T.solution(n, str));
    }
}