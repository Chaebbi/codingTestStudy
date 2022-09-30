package sec04;

import java.util.HashMap;
import java.util.Scanner;

// 모든 아나그램 찾기 : S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성
public class Main4 {
    public int solution(String s, String t){
        int ans = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for(char x : t.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0)+1);
        }
        int l = t.length() -1;
        for(int i = 0; i < l; i++)  am.put(s.charAt(i), am.getOrDefault(s.charAt(i), 0) + 1);
        int lt = 0;
        for(int rt = l; rt < s.length(); rt++) {
            am.put(s.charAt(rt), am.getOrDefault(s.charAt(rt),0)+1);

            if(am.equals(bm)) ans++;

            am.put(s.charAt(lt), am.get(s.charAt(lt))-1);
            if(am.get(s.charAt(lt)) == 0) am.remove(s.charAt(lt));
            lt++;
        }
        return ans;
    }

    public static void main(String[] args){
        Main4 T = new Main4();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        String t = kb.next();

        System.out.print(T.solution(s, t));

    }
}
