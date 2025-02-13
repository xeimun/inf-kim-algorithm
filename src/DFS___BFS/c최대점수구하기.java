package DFS___BFS;

import java.util.Scanner;

public class c최대점수구하기 {
    static int n;
    static int m;
    static int[] score;
    static int[] time;
    static int answer = 0;

    public static void DFS(int idx, int scoreSum, int timeSum) {
        if (timeSum > m) {
            return;
        }
        if (idx == n) {
            answer = Math.max(answer, scoreSum);
        } else {
            DFS(idx + 1, scoreSum + score[idx], timeSum + time[idx]);
            DFS(idx + 1, scoreSum, timeSum);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        score = new int[n];
        time = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = kb.nextInt();
            time[i] = kb.nextInt();
        }
        kb.close();

        DFS(0, 0, 0);
        System.out.println(answer);
    }
}
