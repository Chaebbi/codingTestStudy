package sec05;

import java.util.Scanner;
import java.util.Stack;

//[카카오] 크레인 인형뽑기 : N x N 크기의 정사각 격자이며 위쪽에는 크레인이 있고 오른쪽에는 바구니
// 격자 안 숫자 -> 인형번호, 0은 없는 것
// move : 크레인이 움직일 열 번호 순서
// 바구니에 연속으로 같은 인형 -> 터짐 ==> 터진 인형 수
public class Main3 {
    public int solution(int[][] board, int[] moves){
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pos : moves){
            // board.length : 행크기, board[0].legth : 열크기
            for(int i=0; i<board.length; i++) {
                if(board[i][pos-1] != 0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    // 바구니가 비어있지 않으면서, 스택의 상단의 값peek가 같으면 터뜨림
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        ans += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;  //명심
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Main3 T = new Main3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [][] board = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++){
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for(int i=0; i<m; i++) {
            moves[i] = kb.nextInt();
        }
        System.out.println(T.solution(board, moves));

    }
}
