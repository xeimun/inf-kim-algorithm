package DFS___BFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class e동전교환 {
    static int n;
    static Integer[] coins;
    static int m;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        coins = new Integer[n];
        for (int i = 0; i < n; i++) {
            coins[i] = kb.nextInt();
        }
        m = kb.nextInt();
        kb.close();

        Arrays.sort(coins, Collections.reverseOrder());
        DFS(0, 0);
        System.out.println(answer);
    }

    public static void DFS(int cnt, int sum) {
        if (sum > m || cnt >= answer) {
            return;
        }
        if (sum == m) {
            answer = Math.min(cnt, answer);
        } else {
            for (int coin : coins) {
                DFS(cnt + 1, sum + coin);
            }
        }
    }
}
