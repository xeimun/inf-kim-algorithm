package Sorting___Searching;

import java.util.Arrays;
import java.util.Scanner;

public class f장난꾸러기 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();

        int[] tmp = Arrays.copyOf(arr, n);
        Arrays.sort(arr);
        int[] answer = new int[2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (tmp[i] != arr[i]) {
                answer[index++] = i + 1;
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
