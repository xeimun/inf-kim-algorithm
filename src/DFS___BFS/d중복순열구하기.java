package DFS___BFS;

import java.util.Scanner;

/**
 * 1부터 N까지 번호가 적힌 구슬이 있습니다. 이 중 중복을 허락하여 M번을 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
 */
public class d중복순열구하기 {
    static int[] pm;
    static int n;
    static int m;

    public static void DFS(int idx) {
        if (idx == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[idx] = i;
                DFS(idx + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        kb.close();

        pm = new int[m];
        DFS(0);
    }
}
