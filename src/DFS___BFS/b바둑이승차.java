package DFS___BFS;

import java.util.Scanner;

public class b바둑이승차 {
    static int c;
    static int n;
    static int[] weights;
    static int answer = Integer.MIN_VALUE;

    public static void DFS(int idx, int sum) {
        if (sum > c) {
            return;
        }
        if (idx == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(idx + 1, sum + weights[idx]);
            DFS(idx + 1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = kb.nextInt();
        }
        kb.close();

        DFS(0, 0);
        System.out.println(answer);
    }
}
