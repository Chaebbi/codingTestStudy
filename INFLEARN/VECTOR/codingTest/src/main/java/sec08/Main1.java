package sec08;

import java.util.*;

// 합이 같은 부분집합(DFS : 아마존 인터뷰) N개의 원소로 구성된 집합을 두 개의 부분집합으로 나누었을 때
//두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력
// 둘로 나뉘는 두 부분집합은 서로소 집합이며, 두 부분집합을 합하면 입력으로 주어진 원래의 집합이 되어야함
public class Main1 {
    static String ans = "NO";
    static int n, total = 0;
    boolean flag = false;
    public void DFS(int L, int sum, int[] arr) {
        if(flag) return;
        if(sum / total > 2) return;
        if(L == n) {
            //두 부분집합을 합하면 원래 total
            if((total - sum) == sum) {
                ans = "YES";
                flag = true;
            }
        } else {
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }

    }

    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
            }
        T.DFS(0, 0, arr);
        System.out.println(ans);

    }
}
