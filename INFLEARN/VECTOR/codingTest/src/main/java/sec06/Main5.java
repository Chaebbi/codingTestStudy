package sec06;

import java.util.*;

// 중복확인 : n명 학생들 숫자 중 중복숫자 존재하면 D, 다 다르면 U
public class Main5 {
    public String solution(int n, int[] arr) {
        String ans = "U";
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++) {
            if(arr[i] == arr[i+1]) return "D";
        }
        return ans;

    }
    public static void main(String[] args){
        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.print( T.solution(n, arr));
    }
}
