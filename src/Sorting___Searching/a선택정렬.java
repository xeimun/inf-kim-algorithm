package Sorting___Searching;

import java.util.Scanner;

public class a선택정렬 {
    public static void main(String[] args) {
        // 선택정렬
        // 전체에서 최소(또는 최대) 값을 선택해 앞쪽부터 정렬하는 방식
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();

        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
