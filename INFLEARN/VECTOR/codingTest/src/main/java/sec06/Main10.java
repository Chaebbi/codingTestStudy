package sec06;

import java.util.*;

// 마구간 정하기 : C마리의 말을 N개의 마구간에 배치할 때 가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치
public class Main10 {
    public int count(int[] arr , int dist) {
        int cnt = 1 ; //말의 수
        int ep = arr[0] ;
        for(int i = 1; i<arr.length; i++) {
            if(arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
    public int solution(int n, int c, int[] arr){
        int ans = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while(lt <= rt) {
            int mid = (lt+rt)/2;
            if(count(arr, mid) >= c) {
                ans = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }
        return ans;
    }


    public static void main(String[] args){
        Main10 T = new Main10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int c = kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.print(T.solution(n, c, arr));
    }
}
