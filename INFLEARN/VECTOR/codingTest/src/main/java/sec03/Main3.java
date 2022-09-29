package sec03;

import java.util.*;

// [슬라이딩윈도우] 최대 매출 : n일간 매출기록, 연속된 k일간 최대 매출액을 구하려 함
public class Main3 {
    private int solution(int n, int k, int[] arr) {
        int ans = 0, sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        ans = sum;
        for(int i = k; i < n; i++){
            sum += (arr[i] - arr[i-k]);
            ans = Math.max(ans, sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        Main3 T = new Main3();
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
