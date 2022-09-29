package sec02;

import java.util.Scanner;

public class Main2 {
    // see it if it's bigger than the <people> standing in front of you
    public int solution(int n, int[] arr){
        int ans = 1;    //first person
        int max = arr[0];

        for(int i =1; i<n; i++){
            if(arr[i] > max) {
                ans++;
                max = arr[i];
            }
        }

        return ans;

    }
    public static void main(String[] arg){
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, arr));

    }
}
