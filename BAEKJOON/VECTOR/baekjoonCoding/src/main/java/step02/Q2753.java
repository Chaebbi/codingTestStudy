package step02;

import java.util.Scanner;

public class Q2753 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
            b =1;
        }
        System.out.println(b);
    }
}
