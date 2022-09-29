package sec02;

import java.util.Scanner;

// 격자판 최대합 : N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력
public class Main9 {
    public int solution(int n, int[][] arr){
        int ans = Integer.MIN_VALUE;
        int sumR, sumC;
        for(int i = 0; i < n; i++){
            sumR = sumC = 0;
            // Row fixed to i
            for(int j =0; j < n; j++){
                sumR += arr[i][j];
                sumC += arr[j][i];
            }
            ans = Math.max(ans, sumR);
            ans = Math.max(ans, sumC);
        }
        sumR = sumC = 0;
        //대각선 합 구하기 diagonal lines
        for(int i = 0; i < n; i++){
            sumR += arr[i][i];
            sumC += arr[i][n-i-1];
        }
        ans = Math.max(ans, sumR);
        ans = Math.max(ans, sumC);

        return ans;

    }
    public static void main(String[] arg){
        Main9 T = new Main9();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        //2-dimensional array
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, arr));

    }
}
