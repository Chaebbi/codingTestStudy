package sec04;

import java.util.*;

// 매출액의 종류 : N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류(중복x) 를 각 구간별로 구하는 프로그램
public class Main3 {
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < k-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        //two-pointer
        int lt = 0;
        for(int rt = k-1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            ans.add(map.size());
            map.put(arr[lt], map.get(arr[lt])-1);
            if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }

        return ans;

    }
    public static void main(String[] arg){
        Main3 T = new Main3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n, k, arr)) System.out.print(x + " ");

    }
}
