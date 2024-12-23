package Array;

import java.util.Scanner;

public class c가위바위보 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arrB[i] = kb.nextInt();
        }
        kb.close();

        for (int i = 0; i < n; i++) {
            if (arrA[i] == arrB[i]) {
                System.out.println("D");
            } else if (arrA[i] == 1 && arrB[i] == 3) {
                System.out.println("A");
            } else if (arrA[i] == 2 && arrB[i] == 1) {
                System.out.println("A");
            } else if (arrA[i] == 3 && arrB[i] == 2) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
