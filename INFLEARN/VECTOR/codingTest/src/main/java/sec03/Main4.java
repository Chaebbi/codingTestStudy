package sec03;

import java.util.Scanner;

// 연속 부분수열 : 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램
public class Main4 {
    private int solution(int n, int m, int[] arr) {
        int ans = 0, sum = 0, lt =0;
        for(int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(sum == m) ans++;
            while(sum >= m) {
                sum -= arr[lt++];
                if(sum == m) ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}
