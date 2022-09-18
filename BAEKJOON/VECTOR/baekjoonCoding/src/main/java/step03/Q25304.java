package step03;

import java.util.Scanner;

public class Q25304 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int cnt = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= cnt; i++) {
            int cost = sc.nextInt();
            int count = sc.nextInt();
            sum += cost * count;

        }
        if (sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
