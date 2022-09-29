package sec02;

import java.util.*;

public class Main1 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        // print bigger num (directly in front)
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]) ans.add(arr[i]);
        }

        return ans;

    }
    public static void main(String[] arg){
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n, arr)){
            System.out.print(x + " ");

        }
    }
}
