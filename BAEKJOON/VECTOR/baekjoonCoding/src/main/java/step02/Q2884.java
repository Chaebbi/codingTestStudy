package step02;

import java.util.Scanner;

public class Q2884 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if( m < 45 ){
            h = h == 0 ? 24 : h;
            h--;
            m += 15;
        }else { m -= 45;}
        System.out.println(h + " " + m);
    }
}
