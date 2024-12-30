package Array;

import java.util.Scanner;

public class j봉우리 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        int answer = 0;
        int[] rowArr = {-1, 0, 1, 0};
        int[] columnArr = {0, 1, 0, -1};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int row = i + rowArr[k];
                    int column = j + columnArr[k];
                    if (row >= 0 && row < n && column >= 0 && column < n) {
                        if (arr[row][column] >= arr[i][j]) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
