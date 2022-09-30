package sec04;

import java.util.*;

//K번째 큰 수 : 중복가능, 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록 -> 기록한 값 중 K번째로 큰 수를 출력하는 프로그램
// treeset : 중복제거하고 정렬까지 하는 자료구조 , 트리구조
public class Main5 {
    public int solution(int n, int k, int[] arr){
        int ans = -1;
        //reverse order Tree set
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                for(int l = j+1; l < n; l++) {
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : treeSet) {
            cnt++;
            if(cnt == k) return x;
        }

        return ans;

    }

    public static void main(String[] args){
        Main5 T = new Main5();
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
