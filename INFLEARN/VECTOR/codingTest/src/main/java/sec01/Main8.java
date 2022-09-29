package sec01;

import java.util.*;

public class Main8 {
    public String solution(String str){
        String ans = "NO";
        // replaceAll(정규식, 대체) [^A-Z] : A~Z가 아니면 , "" : 빈문자화 시키기
        str = str.toUpperCase().replaceAll("[^A-Z]" ,"");
        String tmp = new StringBuilder(str).reverse().toString();
        if(tmp.equals(str)) return "YES";
        return ans;

    }
    public static void main(String[] arg){
        Main8 T = new Main8();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
