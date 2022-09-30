package sec06;

import java.util.Scanner;

//  Least Recently Used : 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례대로 출력하는 프로그램
public class Main4 {
    public int[] solution(int n, int s, int[] arr) {
        int[] cache = new int[s];
        for(int x : arr) {
            int pos = -1;
            // hit
            for(int i=0; i<s; i++) {
                if(x == cache[i]) pos = i;  // hit position
            }

            // miss -> 뒤로 땡겨줌
            if(pos == -1) {
                for(int i=s-1; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
            }
            // hit -> 히트 지점부터 땡겨줌
            else {
                for(int i=pos; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args){
        Main4 T = new Main4();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : T.solution(n, s, arr)) System.out.print(x + " ");
    }
}
