package sec06;

import java.util.*;

// 뮤직비디오( 결정알고리즘) : 답이 정렬된 상황의 lt 부터 rt 까지 있다고 확신이 있어야 결정알고리즘 적용 가능
public class Main9 {
    public int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0; // cnt: dvd 개수, sum : 현재 dvd의 저장된 용량
        for(int x : arr) {
            if(sum + x > capacity) {
                cnt++;
                sum = x;
            } else sum += x;
        }
        return cnt;
    }
    public int solution(int n, int m, int[] arr){
        int ans = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while(lt <= rt) {
            int mid = (lt+rt)/2;
            if(count(arr, mid) <= m) {
                ans = mid;
                rt = mid - 1;
            } else lt = mid + 1;

        }
        return ans;
    }

    public static void main(String[] args){
        Main9 T = new Main9();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();   // 곡의 수
        int m = kb.nextInt();   // DVD 개수
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();    //각 곡의 길이
        System.out.print(T.solution(n, m, arr));
    }
}
