package sec01;

import java.util.Scanner;

public class Main1 {
    public int solution(String str, char t){
        int ans = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        /*for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == t) ans ++;
        }*/
        for(char x : str.toCharArray()){
            if(x == t) ans ++;
        }

        return ans;
    }
    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
