package sec06;

import java.util.*;

// 이분검색-> 무조건 정렬되어있어야함  : 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램
public class Main8 {
    public int solution(int n, int m, int[] arr){
        int ans = 0;
        Arrays.sort(arr);
        int lt = 0, rt = n-1;
        while(lt <= rt) {
            int mid = (rt+lt)/2;
            // 값을 찾았으면
            if(arr[mid] == m) {
                ans = mid + 1;
                break;
            }
            // 찾는값보다 오른쪽에 있으면 rt 를 줄이고
            if(arr[mid] > m) { rt = mid - 1; }
            else lt = mid + 1;
        }
        return ans;
    }
    public static void main(String[] args){
        Main8 T = new Main8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        System.out.print(T.solution(n, m, arr));
    }
}
