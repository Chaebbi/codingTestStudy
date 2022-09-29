package sec01;
import java.util.*;

public class Main2 {
    public String solution(String str){
        String ans = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) ans += Character.toUpperCase(x);
            else ans += Character.toLowerCase(x);
        }
        return ans;

    }
    public static void main(String[] arg){
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
