package Recursive___Tree___Graph;

import java.util.Scanner;

/**
 * 인접 행렬을 사용한 그래프 표현
 * - 각 행 i는 정점 i를 의미
 * - graph[i][j] != 0이면 i → j로 가는 간선이 존재
 * - graph[i][j] = w이면 가중치 w를 가진 간선이 존재
 * - 무방향 그래프는 `graph[i][j] == graph[j][i]
 */
public class j그래프와인접행렬 {
    static int n; // 정점 개수
    static int m; // 간선 개수
    static int[][] undirectedGraph; // 무방향 그래프
    static int[][] directedGraph; // 방향 그래프
    static int[][] weightedGraph; // 가중치 그래프

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // 정점(n), 간선(m) 입력
        System.out.print("정점 개수와 간선 개수 입력: ");
        n = kb.nextInt();
        m = kb.nextInt();

        // 그래프 초기화
        undirectedGraph = new int[n + 1][n + 1];
        directedGraph = new int[n + 1][n + 1];
        weightedGraph = new int[n + 1][n + 1];

        System.out.println("간선 정보를 입력하세요 (from to weight): ");
        for (int i = 0; i < m; i++) {
            int from = kb.nextInt();
            int to = kb.nextInt();
            int weight = kb.nextInt(); // 가중치 입력

            // 무방향 그래프
            undirectedGraph[from][to] = 1;
            undirectedGraph[to][from] = 1; // 양방향 연결

            // 방향 그래프
            directedGraph[from][to] = 1; // 단방향 연결

            // 가중치 그래프
            weightedGraph[from][to] = weight;
        }
        kb.close();

        // 그래프 출력
        System.out.println("\n[무방향 그래프]");
        printGraph(undirectedGraph);

        System.out.println("\n[방향 그래프]");
        printGraph(directedGraph);

        System.out.println("\n[가중치 그래프]");
        printGraph(weightedGraph);
    }

    // 그래프 출력 함수
    public static void printGraph(int[][] graph) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
