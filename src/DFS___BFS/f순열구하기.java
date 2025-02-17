package DFS___BFS;

import java.util.Scanner;

/**
 * 10 이하의 N개의 자연수가 주어지면 이 중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
 */
public class f순열구하기 {
    static int n;
    static int m;
    static int[] arr;
    static int[] pm;
    static int[] ch;

    public static void DFS(int idx) {
        if (idx == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[idx] = arr[i];
                    DFS(idx + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();

        ch = new int[n];
        pm = new int[m];
        DFS(0);
    }
}
