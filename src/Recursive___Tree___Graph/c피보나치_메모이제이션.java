package Recursive___Tree___Graph;

import java.util.Scanner;

public class c피보나치_메모이제이션 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();

        int[] arr = new int[n + 1];
        DFS(n, arr);
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int DFS(int n, int[] arr) {
        if (arr[n] > 0) {
            return arr[n];
        }

        if (n == 1 || n == 2) {
            return arr[n] = 1;
        } else {
            return arr[n] = DFS(n - 2, arr) + DFS(n - 1, arr);
        }
    }
}
