package sec01;

import java.util.*;

public class Main7 {
    public String solution(String str){
        String ans = "YES";
        /*str = str.toUpperCase();       //대소문자 구분X 조건때문에 다 upper로
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }*/
        String tmp = new StringBuilder(str).reverse().toString();
        //equalsIgnoreCase  : 대소문자무시하고 equals 채점
        if(!str.equalsIgnoreCase(tmp)) return "NO";

        return ans;

    }
    public static void main(String[] arg){
        Main7 T = new Main7();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}

