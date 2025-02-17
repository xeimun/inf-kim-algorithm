package DFS___BFS;

import java.util.Scanner;

public class g조합의경우수_메모이제이션 {
    static int[][] memoization = new int[34][34];

    public static int DFS(int n, int r) {
        if (memoization[n][r] > 0) {
            return memoization[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return memoization[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(DFS(n, r));
    }
}
