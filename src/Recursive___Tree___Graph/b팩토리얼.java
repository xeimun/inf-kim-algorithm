package Recursive___Tree___Graph;

import java.util.Scanner;

public class b팩토리얼 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();

        System.out.println(DFS(n));
    }

    public static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * DFS(n - 1);
        }
    }
}
