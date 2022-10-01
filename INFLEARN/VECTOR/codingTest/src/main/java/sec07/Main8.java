package sec07;

import java.util.Scanner;

//송아지 찾기 1(BFS : 상태트리탐색)
// 좌표 점으로 주어진 송아지 위치- 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동
// 현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동 가능
// 최소 몇번의 점프로 송아지 위치까지 가는가
public class Main8 {
    public void DFS(int n){

    }

    public static void main(String[] args) {
        Main8 T = new Main8();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();   //현수 위치
        int e = kb.nextInt();   //송아지 위치
        System.out.print(s);
    }
}
