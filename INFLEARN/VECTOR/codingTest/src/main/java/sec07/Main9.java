package sec07;

// Tree 말단노드까지의 까장 짧은 경로(DFS) ==> BFS가 정답이고 DFS로도 풀수있음을 연습하는것
// 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이 : 이동하는 횟수 == 간선edge 개수
public class Main9 {
    Node root;
    public int DFS(int L, Node root) {
        // 말단노드인지 확인
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));

    }
    public static void main(String args[]) {
        Main9 tree = new Main9();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.DFS(0, tree.root));
    }
}
