package sec02;

import java.util.Scanner;
//자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램 (에라토스테네스 체)
public class Main5 {
    public int solution(int n){
        int ans = 0;
        int[] ch = new int[n+1];
        for(int i=2; i<= n; i++){
            if(ch[i] ==0){
                ans++;
                //i의 배수이기 때문에 i씩 증가
                for(int j=i; j <= n; j = j+i) ch[j] =1 ;
            }
        }
        return ans;

    }
    public static void main(String[] arg){
        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.print(T.solution(n));

    }
}
