package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class e동전교환 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        kb.close();

        int[] dy = new int[m + 1];
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - coins[i]] + 1);
            }
        }

        if (dy[m] == Integer.MAX_VALUE) {  // 목표 금액을 만들 수 없는 경우 예외 처리
            System.out.println("해당 금액을 만들 수 없습니다.");
        } else {
            System.out.println(dy[m]);
        }
    }
}
