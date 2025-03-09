package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 문제
 * 가중치 방향그래프에서 1번 정점에서 모든 정점으로의 최소 거리비용을 출력하는 프로그램을 작성하세요. (경로가 없으면 Impossible를 출력한다)
 * <p>
 * 입력설명
 * 첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보와 거리비용이 주어진다.
 * <p>
 * 출력설명
 * 1번 정점에서 각 정점으로 가는 최소비용을 2번 정점부터 차례대로 출력하세요.
 */
public class e다익스트라알고리즘 {

    // 간선을 표현하는 클래스 (우선순위 큐에서 사용할 Comparable 구현)
    static class Edge implements Comparable<Edge> {
        int vertex;  // 도착 정점
        int weight;       // 해당 간선의 비용 (가중치)

        Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return this.weight - other.weight; // 비용이 작은 순으로 정렬 (오름차순)
        }
    }

    static int vertexCount;       // 정점 개수
    static int edgeCount;         // 간선 개수
    static int[] minDistance;     // 최단 거리 저장 배열
    static List<List<Edge>> graph; // 인접 리스트 (그래프 표현)

    // 다익스트라 알고리즘
    public static void dijkstra(int startVertex) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(startVertex, 0)); // 시작 정점을 큐에 추가
        minDistance[startVertex] = 0; // 시작 정점의 최단 거리 0으로 설정

        while (!pq.isEmpty()) {
            Edge currentEdge = pq.poll(); // 현재 최단 거리의 정점 선택
            int currentVertex = currentEdge.vertex; // 현재 정점
            int currentWeight = currentEdge.weight;      // 현재까지의 비용

            // 이미 더 짧은 경로로 방문한 적 있으면 무시
            if (currentWeight > minDistance[currentVertex]) {
                continue;
            }

            // 현재 정점에서 이동 가능한 모든 인접 정점 확인
            for (Edge nextEdge : graph.get(currentVertex)) {
                int nextVertex = nextEdge.vertex;
                int newWeight = minDistance[currentVertex] + nextEdge.weight;

                // 더 짧은 경로를 찾았을 경우 갱신 후 우선순위 큐에 추가
                if (newWeight < minDistance[nextVertex]) {
                    minDistance[nextVertex] = newWeight;
                    pq.offer(new Edge(nextVertex, newWeight));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        vertexCount = kb.nextInt();  // 정점 개수 입력
        edgeCount = kb.nextInt();    // 간선 개수 입력

        // 최단 거리 배열 초기화 (무한대 값으로 설정)
        minDistance = new int[vertexCount + 1];
        Arrays.fill(minDistance, Integer.MAX_VALUE);

        // 그래프 초기화 (인접 리스트 방식)
        graph = new ArrayList<>();
        for (int i = 0; i <= vertexCount; i++) {
            graph.add(new ArrayList<>()); // 정점 개수만큼 리스트 생성
        }

        // 간선 입력 받기
        for (int i = 0; i < edgeCount; i++) {
            int start = kb.nextInt(); // 출발 정점
            int end = kb.nextInt();   // 도착 정점
            int weight = kb.nextInt();// 가중치

            graph.get(start)
                 .add(new Edge(end, weight)); // 방향 그래프
        }

        // 1번 정점에서 시작 (문제에 따라 다름)
        dijkstra(1);

        // 결과 출력 (1번 정점에서 다른 정점까지 최단 거리)
        for (int i = 2; i <= vertexCount; i++) {
            if (minDistance[i] != Integer.MAX_VALUE) {
                System.out.println(i + " : " + minDistance[i]);
            } else {
                System.out.println(i + " : impossible"); // 도달 불가능한 경우
            }
        }
    }
}
