package Recursive___Tree___Graph;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int num) {
        data = num;
        left = null;
        right = null;
    }
}

public class d이진트리순회DFS {
    Node root;

    public void DFS(Node root) {
        if (root == null) {
            return;
        } else {
            // System.out.print(root.data + " "); // 전위 순회
            DFS(root.left);
            System.out.print(root.data + " "); // 중위 순회
            DFS(root.right);
            // System.out.print(root.data + " "); // 후위 순회
        }
    }

    public static void main(String[] args) {
        d이진트리순회DFS tree = new d이진트리순회DFS();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.DFS(tree.root);
    }
}
