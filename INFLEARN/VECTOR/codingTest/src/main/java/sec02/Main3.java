package sec02;

import java.util.Scanner;

public class Main3 {
    //1:가위, 2:바위, 3:보
    public String solution(int n, int[] a, int[] b){
        String ans = "";
        for(int i=0; i<n; i++){
            if(a[i] == b[i]) ans += "D";
            else if(a[i] == 1 && b[i] ==3) ans+= "A";
            else if (a[i] == 2 && b[i] ==1) ans+= "A";
            else if (a[i] == 3 && b[i] ==2) ans+= "A";
            else ans += "B";
        }

        return ans;

    }
    public static void main(String[] arg){
        Main3 T = new Main3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = kb.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = kb.nextInt();
        }
        for(char x : T.solution(n, a, b).toCharArray()) System.out.println(x);

    }
}
