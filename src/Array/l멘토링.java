package Array;

import java.util.Scanner;

public class l멘토링 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        int answer = 0;

        // 모든 학생 쌍 (i, j)에 대해 반복
        for (int i = 1; i <= n; i++) { // 멘토 후보
            for (int j = 1; j <= n; j++) { // 멘티 후보
                int cnt = 0;
                for (int k = 0; k < m; k++) { // 각 테스트에 대해 확인
                    int mentor = 0;
                    int mentee = 0;
                    for (int l = 0; l < n; l++) { // 테스트에서의 학생 위치 탐색
                        if (arr[k][l] == i) {
                            mentor = l;
                        }
                        if (arr[k][l] == j) {
                            mentee = l;
                        }
                    }
                    if (mentor < mentee) {
                        cnt++;
                    }
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
