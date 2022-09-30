package sec06;

import java.util.Scanner;

// 버블정렬 : 이웃한 두수 비교해서 swap -> 한번 끝나면 맨뒤는 정렬된상태
public class Main2 {
    public int[] solution(int n, int[] arr) {
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                // 뒤에가 작으면 swap
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x : T.solution(n, arr)) System.out.print(x + " ");
    }


}
