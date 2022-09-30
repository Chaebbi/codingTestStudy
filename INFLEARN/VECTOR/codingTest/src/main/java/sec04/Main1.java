package sec04;

import java.util.*;

// 학급 회장(해쉬) : 선택한 후보의 기호(알파벳)가 적힌 투표용지 -> 누가 선출인지 출력 <반드시 한 명선출되도록 투표결과 나왔다 가정>
public class Main1 {
    public char solution(int n, String str){
        char ans = ' ';
        HashMap<Character, Integer> map = new HashMap<>();      //map 에 넣는건 put 제거는 remove
        for(char x : str.toCharArray()) {
            //getOrDefault : map에 key 값이 없으면 0을 return
            map.put(x, map.getOrDefault(x, 0) +1);
        }
        // map이란 객체에 특정 key 존재하는지 찾기
//        System.out.println(map.containsKey('A'));       //true
//        System.out.println(map.containsKey('F'));       //false
//        System.out.println(map.size());              // key의 개수


        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()) {
            //System.out.println(key + " " + map.get(key));
            if(map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }
        return ans;

    }
    public static void main(String[] arg){
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.print(T.solution(n, str));

    }
}
