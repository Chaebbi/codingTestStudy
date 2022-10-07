package com.example.demo.sel203;

import java.util.Scanner;

public class Q10820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String str = sc.nextLine();
            int sm = 0; // 소문자
            int bg = 0; // 대문자
            int d = 0; // 숫자
            int b = 0; // 공백

            for(char c : str.toCharArray()) {
                if(c == ' ') {
                    b++;
                } else if(Character.isDigit(c)) {
                    d++;
                } else {
                    if(Character.isUpperCase(c)) {
                        bg++;
                    } else {
                        sm++;
                    }
                }
            }
            System.out.println(sm + " " + bg + " " + d + " " + b);
        }

        sc.close();
    }
}
