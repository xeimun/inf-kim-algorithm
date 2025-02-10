package Recursive___Tree___Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class g송아지찾기 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        kb.close();

        System.out.println(BFS(s, e));
    }

    public static int BFS(int s, int e) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{s, 0});
        boolean[] visited = new boolean[10001];
        visited[s] = true;
        int[] moves = {1, -1, 5};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int pos = cur[0];
            int jumps = cur[1];

            if (pos == e) {
                return jumps;
            }

            for (int move : moves) {
                int nextPos = pos + move;

                if (nextPos >= 1 && nextPos <= 10000 && !visited[nextPos]) {
                    q.offer(new int[]{nextPos, jumps + 1});
                    visited[nextPos] = true;
                }
            }
        }

        return -1;
    }
}
