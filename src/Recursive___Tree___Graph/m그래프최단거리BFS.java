package Recursive___Tree___Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 방향 그래프가 주어졌을 때, 1번 정점에서 다른 모든 정점으로의 최단 거리(간선 개수 기준)를 구하는 프로그램을 작성하세요.
 */
public class m그래프최단거리BFS {
    static int n; // 정점 개수
    static int m; // 간선 개수
    static ArrayList<ArrayList<Integer>> graph; // 인접 리스트
    static int[] visited;
    static int[] distance; // 최단 거리 저장 배열

    public static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = 1;
        distance[v] = 0; // 시작 노드의 거리는 0
        queue.offer(v);

        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (visited[nv] == 0) {
                    visited[nv] = 1;
                    queue.offer(nv);
                    distance[nv] = distance[cv] + 1; // 거리 갱신
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int from = kb.nextInt();
            int to = kb.nextInt();
            graph.get(from)
                 .add(to);
        }
        kb.close();

        visited = new int[n + 1];
        distance = new int[n + 1];

        BFS(1);
        // 결과 출력 (1번 노드를 제외한 나머지 노드에 대한 최단 거리 출력)
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + distance[i]);
        }
    }
}
