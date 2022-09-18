package step01;

import java.util.Scanner;

public class Q2588 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc. nextInt();
        int c = b%10;
        System.out.println(a*c);
        int d = (b%100)/10;
        System.out.println(a*d);
        int e = b/100;
        System.out.println(a*e);
        System.out.println(a*b);

    }
}
