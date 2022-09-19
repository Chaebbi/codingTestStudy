package com.example.demo.step05;

public class Q4673 {
    static boolean[] arr = new boolean[20002];

    public static void d(int n) {
        int tmp = n;
        int sum=0;
        sum = tmp;
        if(tmp <= 10000 && !arr[tmp]) {
            while(tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            d(sum);
            arr[sum] = true;
        }
    }

    public static void main(String[] args) {
        for(int i = 1; i <= 10000; i++) {
            d(i);
        }

        for(int i = 1; i <= 10000; i++) {
            if(!arr[i]) {
                System.out.println(i);
            }
        }
    }
}
