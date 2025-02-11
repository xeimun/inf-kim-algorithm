package Recursive___Tree___Graph;

import java.util.Scanner;

/**
 * 방향 그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
 */
public class k경로탐색DFS_인접행렬 {
    static int n; // 정점 개수
    static int m; // 간선 개수
    static int[][] graph; // 인접 행렬
    static int[] visited; // 방문 여부 체크
    static int answer = 0; // 1번 정점에서 N번 정점까지의 경로 개수

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int from = kb.nextInt();
            int to = kb.nextInt();
            graph[from][to] = 1; // 방향 그래프이므로 단방향 간선 저장
        }
        kb.close();

        visited = new int[n + 1];
        // 1번 정점에서 탐색 시작
        visited[1] = 1; // 시작점 방문 체크
        DFS(1);
        System.out.println(answer);
    }

    public static void DFS(int v) {
        // 목표 정점(N번 정점)에 도달하면 경로 카운트 증가
        if (v == n) {
            answer++;
        } else {
            // 모든 정점을 탐색
            for (int i = 1; i <= n; i++) {
                // 연결된 정점이면서 방문하지 않은 정점이면 이동
                if (graph[v][i] == 1 && visited[i] == 0) {
                    visited[i] = 1; // 방문 체크
                    DFS(i); // 재귀 호출
                    visited[i] = 0; // 백트래킹 (다른 경로 탐색을 위해 원상복구)
                }
            }
        }
    }

}
