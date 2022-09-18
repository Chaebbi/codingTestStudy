package step02;

import java.util.Scanner;

public class Q9498 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rs = sc.nextInt();
        System.out.print((rs>=90)?"A": (rs>=80)? "B": (rs>=70)? "C": (rs>=60)? "D": "F");

    }
}
