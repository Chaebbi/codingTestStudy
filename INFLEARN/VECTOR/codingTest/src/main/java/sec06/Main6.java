package sec06;

import java.util.*;

// 장난꾸러기 : 키순으로 세움 1~N
public class Main6 {
    // 얕은 복사(Shallow Copy) : 복사된 배열이나 원본배열이 변경될 때 서로 간의 값이 같이 변경됩니다.
    // 깊은 복사(Deep Copy) : 복사된 배열이나 원본배열이 변경될 때 서로 간의 값은 바뀌지 않습니다.
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(arr);
        for(int i=0; i<n; i++) {
            if(tmp[i] != arr[i]) ans.add(i+1);
        }
        return ans;

    }

    public static void main(String[] args){
        Main6 T = new Main6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int x :  T.solution(n, arr)) System.out.print(x + " ");
    }
}
