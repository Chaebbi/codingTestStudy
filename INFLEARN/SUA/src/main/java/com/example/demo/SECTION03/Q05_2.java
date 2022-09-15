package com.example.demo.SECTION03;

import java.util.Scanner;

public class Q05_2 {
    public int solution(int n) {
        int answer = 0, cnt = 1;
        n--;
        while(n > 0) {
            cnt++;
            n = n - cnt;
            if(n % cnt == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Q05_2 T = new Q05_2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.print(T.solution(n));
    }
}
