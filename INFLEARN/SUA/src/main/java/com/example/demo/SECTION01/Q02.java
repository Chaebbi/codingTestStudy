package com.example.demo.SECTION01;

import java.util.Scanner;

public class Q02 {
    public String solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            /*
            if(Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
             */

            if(x >= 97 && x <= 122) { // 소문자라면
                answer += (x - 32); // 대문자로 변환
            } else { // 대문자라면
                answer += (x + 32); // 소문자로 변환
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Q02 T = new Q02();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}