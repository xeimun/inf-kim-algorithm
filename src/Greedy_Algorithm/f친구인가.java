package Greedy_Algorithm;

import java.util.Scanner;

public class f친구인가 {
    static int[] parent; // 각 원소의 부모 노드를 저장하는 배열 (Disjoint Set)

    /**
     * 특정 원소의 대표(루트) 노드를 찾는 메소드 (경로 압축 기법 적용)
     *
     * @param node 찾고자 하는 노드
     * @return 해당 노드가 속한 집합의 대표 노드
     */
    public static int find(int node) {
        if (node == parent[node]) {
            return node;
        } else {
            return parent[node] = find(parent[node]); // 경로 압축 최적화
        }
    }

    /**
     * 두 노드를 같은 집합으로 합치는 메소드 (Union 연산)
     *
     * @param nodeA 첫 번째 노드
     * @param nodeB 두 번째 노드
     */
    public static void union(int nodeA, int nodeB) {
        int rootA = find(nodeA);
        int rootB = find(nodeB);
        if (rootA != rootB) {
            parent[rootA] = rootB; // 한 쪽을 다른 쪽에 합침
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // 학생 수 (노드 개수) 및 친구 관계 수 (연결 정보 개수) 입력
        int numStudents = kb.nextInt();
        int numRelations = kb.nextInt();

        // 부모 배열 초기화: 자기 자신을 부모로 설정
        parent = new int[numStudents + 1];
        for (int i = 1; i <= numStudents; i++) {
            parent[i] = i;
        }

        // 친구 관계 입력 및 Union 연산 수행
        for (int i = 0; i < numRelations; i++) {
            int studentA = kb.nextInt();
            int studentB = kb.nextInt();
            union(studentA, studentB);
        }

        // 두 학생이 같은 집합(친구 그룹)에 속해 있는지 확인
        int studentA = kb.nextInt();
        int studentB = kb.nextInt();
        kb.close();

        if (find(studentA) == find(studentB)) {
            System.out.println("YES"); // 같은 친구 그룹
        } else {
            System.out.println("NO");  // 다른 친구 그룹
        }

        kb.close();
    }
}
