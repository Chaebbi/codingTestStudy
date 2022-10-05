package sec08;

import java.util.*;

// 동전교환 : 동전 종류개수 n, 두번째줄에 동전의 종류, 다음줄에 거스름돈 m
// 거스름돈을 가장 적은 수의 동전으로 교환하는 최소개수
class Main5 {
    static int n, m, answer=Integer.MAX_VALUE;
    // time limit 때문에 큰 금액부터 보도록 적용
    public void DFS(int L, int sum, Integer[] arr) {
        // 15 넘어가면 더이상 뻗지 않는다.
        if(sum > m) return;
        if(L >= answer) return;    // 더 깊은걸 볼 필요없음
        if(sum == m) {
            answer = Math.min(answer, L);
        } else {
            for(int i=0; i<n; i++) {
                DFS(L+1, sum+arr[i], arr);
            }
        }

    }

    public static void main(String[] args){
        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();   // 동전 종류 개수
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());   // 큰 수부터 시행

        m = kb.nextInt();   // 거스름돈
        T.DFS(0, 0, arr);
        System.out.println(answer);

    }
}
