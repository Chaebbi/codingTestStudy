package com.example.demo.SECTION01;

import java.util.Scanner;

public class Q07 {
    public String solution(String str) {
        String answer = "YES";
        /*
        str = str.toUpperCase();
        int len = str.length();

        for(int i = 0; i < len / 2; i++) {
            if(str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }
         */
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args){
        Q07 T = new Q07();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}