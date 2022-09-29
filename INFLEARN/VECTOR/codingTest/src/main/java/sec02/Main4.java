package sec02;

import java.util.Scanner;

// 4. 피보나치 수열
public class Main4 {
    //if 손코딩 no array use
    public void solution2(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < n; i++){
            c = a + b;
            System.out.println(c + " ");
            a = b; b = c;
        }
    }
    public int[] solution(int n){
        int ans[] = new int[n];
        ans[0] = 1;
        ans[1] = 1;
        for(int i=2; i<n; i++){
            ans [i] = ans[i-2] + ans[i-1];
        }
        return ans;

    }
    public static void main(String[] arg){
        Main4 T = new Main4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int x : T.solution(n)) System.out.print(x + " ");

    }
}
