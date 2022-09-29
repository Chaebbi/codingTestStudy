package sec03;

import java.util.*;

// 최대 매출 : n일간 매출기록, 연속된 k일간 최대 매출액을 구하려 함
public class Main3 {
    private ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        return ans;
    }
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = kb.nextInt();
        }
        for(int x : T.solution(n, m, a, b)) System.out.print(x + " ");
    }
}
