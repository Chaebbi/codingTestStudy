package sec03;

import java.util.*;

// 두 배열 합치기 : 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램
public class Main1 {
    private ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        int p1 = 0, p2 =0;
        while(p1 < n && p2 < m){
            //후위증감 : add먼저 하고 ++
            if(a[p1] < b[p2]) ans.add(a[p1++]);
            else ans.add(b[p2++]);
        }
        while(p1 < n) ans.add(a[p1++]);
        while(p2 < m) ans.add(b[p2++]);
        return ans;
    }
    public static void main(String[] args) {
        Main1 T = new Main1();
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
