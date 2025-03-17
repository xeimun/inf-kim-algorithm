package Dynamic_Programming;

import java.util.Scanner;

public class b돌다리건너기 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();

        int[] dy = new int[n + 2];
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n + 1; i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }

        System.out.println(dy[n + 1]);
    }
}
