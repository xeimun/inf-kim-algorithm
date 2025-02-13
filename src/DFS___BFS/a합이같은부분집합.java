package DFS___BFS;

import java.util.Scanner;

public class a합이같은부분집합 {
    static String answer = "NO";
    static int n;
    static int totalSum;
    static int[] numbers;
    static boolean flag = false;

    public static void DFS(int idx, int sum) {
        // 이미 정답을 찾았거나, 현재 합이 전체 합의 절반을 초과하면 더 이상 탐색할 필요 없음
        if (flag || sum > totalSum / 2) {
            return;
        }

        // idx == n이면, 모든 원소를 포함할지 말지를 결정한 상태
        if (idx == n) {
            if (sum == totalSum - sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(idx + 1, sum + numbers[idx]);
            DFS(idx + 1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = kb.nextInt();
            totalSum += numbers[i];
        }
        kb.close();
        
        DFS(0, 0);
        System.out.println(answer);
    }
}
