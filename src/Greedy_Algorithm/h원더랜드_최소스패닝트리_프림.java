package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class h원더랜드_최소스패닝트리_프림 {
    static class Edge implements Comparable<Edge> {
        int destination;
        int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cityCnt = kb.nextInt(); // 도시의 개수
        int roadCnt = kb.nextInt(); // 도로의 개수
        int[] visited = new int[cityCnt + 1]; // 방문 여부를 저장하는 배열 (1: 방문, 0: 미방문)
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= cityCnt; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < roadCnt; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();

            // 양방향 간선 추가
            graph.get(a)
                 .add(new Edge(b, c));
            graph.get(b)
                 .add(new Edge(a, c));
        }
        kb.close();

        int answer = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(5, 0)); // 시작 정점 선택(아무거나 선택)
        while (!pq.isEmpty()) {
            Edge currentEdge = pq.poll();
            int currentCity = currentEdge.destination;

            // 해당 정점이 아직 방문되지 않았다면 MST에 추가
            if (visited[currentCity] == 0) {
                visited[currentCity] = 1;
                answer += currentEdge.weight;

                // 현재 정점과 연결된 모든 인접 정점을 탐색
                for (Edge adjacentEdge : graph.get(currentCity)) {
                    // 아래 방문 검사는 생략해도 되나, 성능 최적화를 위함
                    if (visited[adjacentEdge.destination] == 0) {
                        pq.offer(new Edge(adjacentEdge.destination, adjacentEdge.weight));
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
