package sec03;

import java.util.*;

//공통원소 구하기 :두 집합의 교집합 <오름차순>으로 출력하는 프로그램
public class Main2 {
    private ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        //ascend order
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 =0;
        //Intersection
        while(p1 < n && p2 < m){
            if(a[p1] == b[p2]){
                ans.add(a[p1++]);
                p2++;
            }
            else if(a[p1] < b[p2]) p1++;
            else p2++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Main2 T = new Main2();
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
