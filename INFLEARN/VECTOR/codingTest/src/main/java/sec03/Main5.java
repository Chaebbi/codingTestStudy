package sec03;

import java.util.*;

//[Two pointer] 연속된 자연수의 합 : 연속부분수열의 합 , <2개 이상>의 연속된 자연수의 합으로 정수 N을 표현하는 경우의 수
public class Main5 {
    private int solution(int n) {
        int ans = 0, sum =0, lt =0;;
        int m = n/2 + 1;
        int[] arr = new int[m];
        for(int i = 0; i < m; i++) arr[i] = i+1; //자연수를 arr에 넣음
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if(sum == n) ans++;
            while(sum >= n){
                sum -= arr[lt++];
                if(sum == n) ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
    }
}
