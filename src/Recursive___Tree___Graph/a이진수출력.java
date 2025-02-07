package Recursive___Tree___Graph;

import java.util.Scanner;

public class a이진수출력 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();

        DFS(n);
    }

    public static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n / 2);
            System.out.print(n % 2 + " ");
        }
    }
}
