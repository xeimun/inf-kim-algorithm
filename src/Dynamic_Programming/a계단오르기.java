package Dynamic_Programming;

import java.util.Scanner;

public class a계단오르기 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();

        int[] dy = new int[n + 1];
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }

        System.out.println(dy[n]);
    }
}
