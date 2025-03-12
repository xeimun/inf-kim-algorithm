package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class g원더랜드_최소스패닝트리_크루스칼 {
    static class Edge implements Comparable<Edge> {
        int start, end, weight;

        Edge(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return this.weight - other.weight; // 가중치 기준 오름차순 정렬
        }
    }

    static int[] parent;

    public static int find(int node) {
        if (node == parent[node]) {
            return node;
        } else {
            return parent[node] = find(parent[node]); // 경로 압축 (Path Compression)
        }
    }

    public static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {
            parent[rootB] = rootA; // b의 부모를 a의 부모로 설정 (트리 병합)
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numVertices = kb.nextInt(); // 정점 개수
        int numEdges = kb.nextInt(); // 간선 개수

        parent = new int[numVertices + 1]; // 부모 배열 초기화
        List<Edge> edges = new ArrayList<>();

        for (int i = 1; i <= numVertices; i++) {
            parent[i] = i; // 각 정점의 부모를 자기 자신으로 설정
        }

        for (int i = 0; i < numEdges; i++) {
            int start = kb.nextInt();
            int end = kb.nextInt();
            int weight = kb.nextInt();
            edges.add(new Edge(start, end, weight));
        }
        kb.close();

        Collections.sort(edges); // 간선 가중치 기준 정렬

        int totalWeight = 0; // 최소 스패닝 트리의 총 가중치
        int edgeCount = 0; // 현재 선택된 간선 개수

        for (Edge edge : edges) {
            int rootStart = find(edge.start);
            int rootEnd = find(edge.end);

            if (rootStart != rootEnd) { // 같은 집합이 아닐 때만 선택
                totalWeight += edge.weight;
                union(edge.start, edge.end);
                edgeCount++;
            }

            if (edgeCount == numVertices - 1) {
                break; // MST 완성 (간선 개수 = 정점 개수 - 1)
            }
        }

        System.out.println(totalWeight);
    }
}
