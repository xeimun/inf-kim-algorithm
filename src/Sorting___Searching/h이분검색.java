package Sorting___Searching;

import java.util.Arrays;
import java.util.Scanner;

public class h이분검색 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();

        Arrays.sort(arr);
        int answer = -1;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            } else if (arr[mid] < m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
