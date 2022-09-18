package com.example.demo.step05;

public class Q15596 {
    long sum(int[] a) {
        long answer = 0;
        for(int i = 0; i < a.length; i++) {
            answer += a[i];
        }
        return answer;
    }
}