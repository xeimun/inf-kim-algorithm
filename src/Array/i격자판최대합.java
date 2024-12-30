package Array;

import java.util.Scanner;

public class i격자판최대합 {
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
        for (int i = 0; i < n; i++) {
            int vSum = 0;
            int hSum = 0;
            for (int j = 0; j < n; j++) {
                vSum += arr[i][j];
                hSum += arr[j][i];
            }
            answer = Math.max(answer, vSum);
            answer = Math.max(answer, hSum);
        }

        int dSum1 = 0;
        int dSum2 = 0;
        for (int i = 0; i < n; i++) {
            dSum1 += arr[i][i];
            dSum2 += arr[n - 1 - i][i];
        }
        answer = Math.max(answer, dSum1);
        answer = Math.max(answer, dSum2);

        System.out.println(answer);
    }
}
