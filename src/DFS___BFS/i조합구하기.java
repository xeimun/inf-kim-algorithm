package DFS___BFS;

import java.util.Scanner;

/**
 * 1부터 N까지 번호가 적힌 구슬이 있습니다. 이 중 M개를 뽑는 방법의 수를 출력하는 프로그램을 작성하세요.
 */
public class i조합구하기 {
    static int[] combi;
    static int n;
    static int m;

    public static void DFS(int idx, int start) {
        if (idx == m) {
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = start; i <= n; i++) {
                combi[idx] = i;
                DFS(idx + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        kb.close();

        combi = new int[m];
        DFS(0, 1);
    }
}
