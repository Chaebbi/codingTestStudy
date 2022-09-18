package step02;

import java.util.Scanner;

public class Q2480 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int p = 0;
        if (a == b && b == c) {
            p = 10000 + 1000*a ;
        } else if (a == b || b == c) {
            p = 1000 + b*100;
        } else if ( a == c ){
            p = 1000 + a*100;
        } else { p = Math.max(Math.max(a,b),c)*100 ; }
        System.out.println(p);
    }
}
