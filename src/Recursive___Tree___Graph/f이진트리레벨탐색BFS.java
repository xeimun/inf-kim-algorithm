package Recursive___Tree___Graph;

import java.util.LinkedList;
import java.util.Queue;

public class f이진트리레벨탐색BFS {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int num) {
            data = num;
            left = null;
            right = null;
        }
    }

    Node root;

    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int level = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(level + " : ");
            for (int i = 0; i < len; i++) {
                Node node = Q.poll();
                System.out.print(node.data + " ");
                if (node.left != null) {
                    Q.offer(node.left);
                }
                if (node.right != null) {
                    Q.offer(node.right);
                }
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        f이진트리레벨탐색BFS tree = new f이진트리레벨탐색BFS();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.BFS(tree.root);
    }
}
