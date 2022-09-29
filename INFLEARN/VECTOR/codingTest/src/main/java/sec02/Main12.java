package sec02;

import java.util.Scanner;

// 멘토링 :  M번의 테스트 등수를 가지고 멘토와 멘티를 정함. 멘토는 모든 테스트에서 멘티보다 등수가 앞서야함
// ->  주어진 M번의 수학성적으로 짝을 만들 수있는 경우의 수 출력
public class Main12 {
    public int solution(int n, int m, int[][] arr){
        int ans = 0;
        for(int i =1; i <= n; i++) {
            for(int j=1; j<=n; j++){
                int cnt = 0;
                //test
                for(int k = 0; k < m; k++){
                    int pi = 0, pj = 0;
                    //student ranking
                    for(int s =0; s < n; s++){
                        if(arr[k][s] == i) pi = s;
                        if(arr[k][s] == j) pj = s;
                    }
                    if(pi < pj) cnt++;
                }
                if(cnt ==m) {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] arg){
        Main12 T = new Main12();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();    //student
        int m = kb.nextInt();     //test
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.print(T.solution(n, m, arr));

    }
}
