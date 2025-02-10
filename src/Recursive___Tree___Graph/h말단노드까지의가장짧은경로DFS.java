package Recursive___Tree___Graph;

/**
 * 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요
 * 단,모든 노드는 자식이 2개이다
 * (이 문제는 BFS로 푸는게 맞지만, DFS 연습을 위함)
 */
public class h말단노드까지의가장짧은경로DFS {
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

    public int DFS(int level, Node root) {
        if (root.left == null && root.right == null) {
            return level;
        } else {
            return Math.min(DFS(level + 1, root.left), DFS(level + 1, root.right));
        }
    }

    public static void main(String[] args) {
        h말단노드까지의가장짧은경로DFS tree = new h말단노드까지의가장짧은경로DFS();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
