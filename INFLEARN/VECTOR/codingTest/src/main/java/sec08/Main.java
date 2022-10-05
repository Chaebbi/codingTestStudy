package sec08;

import java.util.*;
public class Main {
    static String ans;
    static int n;

    public void DFS(int L, int[] arr) {

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        T.DFS(0, arr);
        System.out.println(ans);

    }
}
