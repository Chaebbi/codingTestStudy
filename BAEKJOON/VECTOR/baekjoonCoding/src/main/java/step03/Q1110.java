package step03;

import java.util.Scanner;

public class Q1110 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int cycle = 0;
        int copy = N;
        while (true) {
            N = (N % 10) * 10 + (((N / 10) + (N % 10)) % 10);
            cycle++;
            if (copy == N) {
                break;
            }
        }
        System.out.println(cycle);
    }
}
