package sec01;

import java.util.*;
// char형 숫자 : 48~57 aschii
public class Main9 {
    public int solution(String str){
        //solution using aschii num
        /*
        int ans = 0;
        for(char x: str.toCharArray()) {
            if( x>= 48 && x <= 57) ans = ans * 10 + (x-48);
        }
        return ans;*/

        //use Character method instead
        String ans = "";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) ans += x;
        }
        return Integer.parseInt(ans);

    }
    public static void main(String[] arg){
        Main9 T = new Main9();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
