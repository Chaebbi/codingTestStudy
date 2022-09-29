package sec02;

import java.util.Scanner;

 // 연속적으로 답을 맞히는 경우에는 가산점, k번 연속 -> k점
public class Main7 {
    public int solution(int n, int[] arr){
        int ans = 0, cnt =0;
        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                cnt++;
                ans += cnt;
            }
            else cnt = 0;
        }
        return ans;

    }
    public static void main(String[] arg){
        Main7 T = new Main7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, arr));

    }
}
