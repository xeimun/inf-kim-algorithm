package Recursive___Tree___Graph;

import java.util.Scanner;

/**
 * 자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 모든 부분집합을 출력하는 프로그램을 작성하세요
 * 단 공집합은 출력하지 않는다
 */
public class e부분집합구하기DFS {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();

        int[] arr = new int[n + 1];
        DFS(1, n, arr);
    }

    public static void DFS(int x, int n, int[] arr) {
        if (x > n) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (arr[i] == 1) {
                    tmp.append(i);
                }
            }
            if (!tmp.isEmpty()) {
                System.out.println(tmp);
            }
        } else {
            arr[x] = 1; // 해당 원소 포함
            DFS(x + 1, n, arr);
            arr[x] = 0; // 해당 원소 미포함
            DFS(x + 1, n, arr);
        }
    }
}
