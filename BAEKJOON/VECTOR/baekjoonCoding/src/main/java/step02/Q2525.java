package step02;

import java.util.Scanner;

public class Q2525 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        a += c/60;
        b += c%60;

        if(b >= 60){
            a++;
            b -= 60;
        }

        a = a >= 24 ? a-24 : a;
        System.out.println(a + " " + b);

    }
}
