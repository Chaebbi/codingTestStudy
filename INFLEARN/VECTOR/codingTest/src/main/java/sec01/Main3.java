package sec01;

import java.util.*;

public class Main3 {
    public String solution(String str){
        String ans = "";
        int m = Integer.MIN_VALUE; // initialize m minium value
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if(len > m){
                m = len;
                ans = x;
            }
        }


        return ans;

    }
    public static void main(String[] arg){
        Main3 T = new Main3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
