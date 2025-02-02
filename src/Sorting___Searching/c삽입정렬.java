package Sorting___Searching;

import java.util.Scanner;

public class c삽입정렬 {
    public static void main(String[] args) {
        // 삽입정렬
        // 현재 원소를 정렬된 부분의 적절한 위치에 삽입하는 방식
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();

        for (int i = 1; i < n; i++) {
            int tmp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
