package sec01;

import java.util.Scanner;

public class Main10 {
    public int[] solution(String str, char target){
        int[] ans = new int[str.length()];
        int p = 1000;
        // Repeat Left direction
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == target){
                p = 0;
                ans[i] = p;
            } else {
                p++;
                ans[i] = p;
            }
        }
        // Repeat Right direction
        p = 1000;
        for(int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i) == target){
                p = 0;
            } else {
                p++;
                ans[i] = Math.min(ans[i], p);   //replace when it's small
            }
        }
        return ans;

    }
    public static void main(String[] arg){
        Main10 T = new Main10();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char target = kb.next().charAt(0);
        for(int x : T.solution(str, target)){
            System.out.print(x + " ");
        }
    }
}