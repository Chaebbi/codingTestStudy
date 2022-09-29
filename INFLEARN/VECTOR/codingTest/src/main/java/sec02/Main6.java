package sec02;

import java.util.ArrayList;
import java.util.Scanner;

//입력된 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램
public class Main6 {
    public boolean isPrime(int num){
        if (num == 1) return false;
        for(int i=2; i<num; i++){
            if(num % i ==0) return false;
        }
        return true;
    }
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            //reverse
            while(tmp > 0){
                int t = tmp % 10;
                res = res * 10 + t;
                tmp /= 10;
            }
            //Prime check
            if(isPrime(res)) ans.add(res);
        }
        return ans;

    }
    public static void main(String[] arg){
        Main6 T = new Main6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n,arr)){
            System.out.print(x + " ");
        }
    }
}
