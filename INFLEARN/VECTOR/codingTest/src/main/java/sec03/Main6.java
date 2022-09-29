package sec03;

import java.util.Scanner;

// 최대 길이 연속부분수열 : 최대 k번을 0을 1로 변경가능. 최대 k번의 변경을 통해 수열에서 1로만 구성된 최대 길이 연속부분수열 찾는 프로그램
public class Main6 {
    private int solution(int n, int k, int[] arr) {
        //cnt : count of 0 -> 1 by rt
        int ans = 0, cnt = 0, lt =0;
        for(int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) cnt ++;
            while(cnt > k) {
                if(arr[lt] == 0) cnt --;
                lt++;
            }
            ans = Math.max(ans, rt-lt+1);
        }
        return ans;

    }

    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}
