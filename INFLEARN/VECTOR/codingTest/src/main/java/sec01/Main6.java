package sec01;

import java.util.*;

public class Main6 {
    public String solution(String str){
        String ans = "";
        // 처음 문자가 처음 발견되는 위치 : str.indexOf(str.charAt(i))
        for(int i=0; i<str.length(); i++) {
            if(i == str.indexOf(str.charAt(i))) {
                ans+= str.charAt(i);
            }
        }
        return ans;

    }
    public static void main(String[] arg){
        Main6 T = new Main6();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
