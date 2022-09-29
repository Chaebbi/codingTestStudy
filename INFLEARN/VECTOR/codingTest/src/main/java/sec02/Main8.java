package sec02;

import java.util.ArrayList;
import java.util.Scanner;

//등수구하기 : 입력된 N명의 학생의 국어점수이 등수를 입력된 순서대로 출력
public class Main8 {
    public int[] solution (int n, int[] arr){
        int[] ans = new int[n]; // 초기화는 0으로 다 된다.
        for(int i = 0; i < n; i++){
            int ranking = 1;
            for(int j = 0; j < n; j++){
                if(arr[j] > arr[i]) ranking++;
            }
            ans[i] = ranking;

        }
        return ans;

    }
    public static void main(String[] arg){
        Main8 T = new Main8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n, arr)) System.out.print(x + " ");

    }
}
