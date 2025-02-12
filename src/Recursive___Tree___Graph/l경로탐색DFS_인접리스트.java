package Recursive___Tree___Graph;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 방향 그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요.
 */
public class l경로탐색DFS_인접리스트 {
    static int n; // 정점 개수
    static int m; // 간선 개수
    static int answer = 0;
    static int[] visited;
    static ArrayList<ArrayList<Integer>> graph; // 인접 리스트

    public static void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int nv : graph.get(v)) {
                if (visited[nv] == 0) {
                    visited[nv] = 1;
                    DFS(nv);
                    visited[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<>();
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
        visited[1] = 1;
        
        DFS(1);
        System.out.println(answer);
    }
}
