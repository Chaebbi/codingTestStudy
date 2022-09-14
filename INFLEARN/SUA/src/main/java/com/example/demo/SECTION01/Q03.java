package com.example.demo.SECTION01;

import java.util.Scanner;

public class Q03 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        /*
        String[] s = str.split(" ");

        for(String x : s) {
            int len = x.length();

            if (len > m) {
                m = len;
                answer = x;
            }
        }
         */

        while((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();

            if(len > m) { // >= 아닌 이유는 뒤에 위치한 경우는 제외하려고
                m = len;
                answer = tmp;
            }

            str = str.substring(pos + 1);
        }

        if(str.length() > m) {
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args){
        Q03 T = new Q03();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine(); // 한 줄 입력 받기
        System.out.print(T.solution(str));
    }
}