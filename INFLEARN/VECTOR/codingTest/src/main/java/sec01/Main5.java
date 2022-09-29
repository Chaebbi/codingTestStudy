package sec01;

import java.util.*;

public class Main5 {
    public String solution(String str){
        String ans;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() -1;
        while (lt < rt) {
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        ans = String.valueOf(s);
        return ans;
    }




    public static void main(String[] arg){
        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}
