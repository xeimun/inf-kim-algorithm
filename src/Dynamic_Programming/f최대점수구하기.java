package Dynamic_Programming;

import java.util.Scanner;

public class f최대점수구하기 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] dy = new int[m + 1];
        for (int i = 0; i < n; i++) {
            int score = kb.nextInt();
            int time = kb.nextInt();
            for (int j = m; j >= time; j--) {
                dy[j] = Math.max(dy[j], dy[j - time] + score);
            }
        }
        System.out.println(dy[m]);
    }
}