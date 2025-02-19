package DFS___BFS;

import java.util.Scanner;

/**
 * Hint.
 * 삼각형 맨 위의 숫자들은 1부터 n까지의 순열 중 하나이며,
 * 각 자리의 숫자에 대해 [n-1 C 0] ~ [n-1 C n-1]를 곱하고 다 더한 값이 f가 된다.
 */
public class h수열추측하기 {
    static int n;
    static int f;
    static int[] b;
    static int[] p;
    static int[] check;
    static boolean flag = false;
    static int[][] memoization;

    public static int combi(int n, int r) {
        if (memoization[n][r] > 0) {
            return memoization[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return memoization[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }

    public static void DFS(int idx, int sum) {
        if (flag) {
            return;
        }
        if (idx == n) {
            if (sum == f) {
                for (int x : p) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    p[idx] = i;
                    DFS(idx + 1, sum + (p[idx] * b[idx]));
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        f = kb.nextInt();
        kb.close();

        b = new int[n];
        p = new int[n];
        check = new int[n + 1];
        memoization = new int[n][n];
        for (int i = 0; i < n; i++) {
            b[i] = combi(n - 1, i);
        }
        DFS(0, 0);
    }
}
