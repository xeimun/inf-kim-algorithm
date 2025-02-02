package Sorting___Searching;

import java.util.Scanner;

public class b버블정렬 {
    public static void main(String[] args) {
        // 버블정렬
        // 인접한 두 원소를 비교하여 교환하며 큰 값을 뒤로 보내는 방식의 정렬
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
