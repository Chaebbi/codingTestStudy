package sec01;

import java.util.*;

public class Main12 {
    // # -> binary number 1 and * -> binary number 0
    public String solution(int n, String str){
        String ans = "";
        for(int i=0; i<n; i++){
            //substract from string (start index, end index)
            // replace from string (target, replacement)
            String tmp = str.substring(0,7).replace("#", "1").replace("*", "0");
            // binary to aschii -> parseInt(target, radix)
            ans += (char)Integer.parseInt(tmp, 2);

            str = str.substring(7);     // substract from string(begin) until the end

        }

        return ans;

    }

    public static void main(String[] arg){
        Main12 T = new Main12();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.print(T.solution(n, str));
    }
}
