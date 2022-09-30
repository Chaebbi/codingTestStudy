package sec05;

import java.util.*;

// 응급실 문제 : 응급환자 도착순서대로, 위험도 높은 환자 있으면 제일 뒤로
// N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇 번째로 진료를 받는지 출력하는 프로그램
class Person {
    int id;
    int priority;
    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
public class Main8 {
    public int solution(int n, int m, int[] arr) {
        int ans = 0;
        Queue<Person> queue = new LinkedList<>();
        for(int i=0; i<n; i++) {
            queue.add(new Person(i, arr[i]));
        }
        while(!queue.isEmpty()) {
            Person tmp = queue.poll();
            for(Person x : queue) {
                if(x.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null) {
                ans++;
                if(tmp.id == m) return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Main8 T = new Main8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));

    }


}
