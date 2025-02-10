package Recursive___Tree___Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요
 * 노드는 자식이 1개일 수도 있다
 */
public class i말단노드까지의가장짧은경로BFS {
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

    public int BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();
                if (cur.left == null && cur.right == null) {
                    return level;
                }
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
            level++;
        }

        return -1;
    }

    public static void main(String[] args) {
        i말단노드까지의가장짧은경로BFS tree = new i말단노드까지의가장짧은경로BFS();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        System.out.println(tree.BFS(tree.root));
    }
}
