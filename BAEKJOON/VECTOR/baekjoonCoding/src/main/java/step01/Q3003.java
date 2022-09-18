package step01;

import java.util.Scanner;

public class Q3003 {
    public static void main(String[] args) {
        // 1 king, 1 queen, 2 rook, 2 bishop, 2 knight, 8 font
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int b = sc.nextInt();
        int kn = sc.nextInt();
        int f = sc.nextInt();
        k = 1-k; q = 1-q;
        r = 2-r; b = 2-b; kn = 2-kn;
        f = 8-f;
        System.out.printf("%d %d %d %d %d %d", k, q, r, b, kn, f);

    }

}
