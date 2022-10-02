package sec07;
// 이진트리 순회
//5. 이진트리순회 (DFS : Depth-First Search)
class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
public class Main5 {
    Node root;
    public void DFS(Node root) {
        // 말단
        if(root == null) return;
        else {
            System.out.print(root.data + " ");  // 전위순회
            DFS(root.lt);   //왼쪽으로가라
//            System.out.print(root.data + " ");  // 중위순회
            DFS(root.rt);   //오른쪽으로 가라
//            System.out.print(root.data + " ");  // 후위순회
        }

    }
    public static void main(String args[]) {
        Main5 tree = new Main5();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.DFS(tree.root);

    }


}
