package com.example.demo.sel203;


import java.util.Scanner;

public class Q11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(char c : str.toCharArray()) {
            if(c >= 'A' && c <= 'Z') { // A ~ Z : 65 ~ 90
                c += 13;
                if(c > 'Z') {
                    c -= 26;
                }
            } else if(c >= 'a' && c <= 'z') { // a ~ z : 97 ~ 122
                c += 13;
                if(c > 'z') {
                    c -= 26;
                }
            }
            System.out.print(c);
        }

        sc.close();
    }
}
