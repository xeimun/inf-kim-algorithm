package Array;

import java.util.Scanner;

public class d피보나치수열 {
    public static void main(String[] args) {
        // 방법1 - 배열 X
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();

        int a = 1;
        int b = 1;
        int c = 0;

        System.out.printf("%d %d ", a, b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        // 방법2 - 배열 O
        /*
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }
        */
    }
}
