package sec01;

import java.util.*;

public class Main11 {
    public String solution(String str){
        String ans = "";
        str += " ";     // attach space to str
        int cnt = 1;
        for(int i=0; i < str.length()-1; i++){  //str.length()-1 l
            if(str.charAt(i) == str.charAt(i+1)) cnt++; //duplicate
            else {  //not duplicate
                ans += str.charAt(i);
                if(cnt > 1) ans += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return ans;

    }
    public static void main(String[] arg){
        Main11 T = new Main11();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
