package sec02;

import java.util.Scanner;

//임시반장 정하기 : 각 학생들이 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 표 -> 같은 반이었던 사람이 가장 많은 학생을 임시반장으로
public class Main11 {
    public int solution(int n, int[][] arr){
        int ans = 0, max = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            int cnt = 0;
             for(int j = 1; j <= n; j++){
                 //student i, student j , year k
                 for(int k = 1; k <= 5; k++){
                     if(arr[i][k] == arr[j][k]){
                         cnt++;
                         break;
                     }
                 }
             }
             if(cnt > max) {
                 max = cnt;
                 ans = i;
             }
        }
        return ans;

    }
    public static void main(String[] arg){
        Main11 T = new Main11();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n+1][6];
        // i : student
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 5; j++){ //j : year
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));

    }
}
