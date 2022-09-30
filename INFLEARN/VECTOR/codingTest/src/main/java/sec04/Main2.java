package sec04;

import java.util.*;

// 아나그램(해쉬) :두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하는 두 단어
public class Main2 {
    public String solution(String str1, String str2){
        String ans = "YES";
        HashMap<Character, Integer> map  = new HashMap<>();
        for(char x : str1.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for(char x : str2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x) -1);
        }
        return ans;

    }
    public static void main(String[] arg){
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();
        System.out.print(T.solution(str1, str2));

    }
}
