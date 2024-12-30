package Array;

import java.util.Scanner;

public class k임시반장정하기 {
    public static void main(String[] args) {
        // 방법1 - 같은 반 관계를 개수 증가로 표현
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        int answer = 0;
        int max = 0;
        // 각 학생 i를 기준으로 다른 학생들과 같은 반을 경험한 횟수 계산
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) { // 다른 학생 j와 비교
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) { // 각 학년(1~5학년) 반복
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i + 1; // 학생 번호 저장 (0부터 시작이므로 +1)
            }
        }

        System.out.println(answer);

        // 방법2 - 같은 반 관계를 boolean 타입으로 표현
        /*
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        // 학생 간 같은 반 여부를 기록하는 2차원 배열
        // relation[i][j] = true면 i와 j는 같은 반 경험 있음
        boolean[][] relation = new boolean[n][n];

        // 학년별로 같은 반 여부 계산
        for (int i = 0; i < n; i++) { // 기준 학생
            for (int j = 0; j < n; j++) { // 다른 학생
                for (int k = 0; k < 5; k++) { // 각 학년(1~5학년) 반복
                    if (arr[i][k] == arr[j][k]) {
                        relation[i][j] = true;
                        break;
                    }
                }
            }
        }

        int answer = 0;
        int max = 0;

        // 각 학생이 다른 학생들과 같은 반 경험 횟수 계산
        for (int i = 0; i < relation.length; i++) {
            int sum = 0;
            for (boolean flag : relation[i]) {
                if (flag) {
                    sum += 1;
                }
            }
            if (sum > max) {
                max = sum;
                answer = i + 1; // 학생 번호 저장 (0부터 시작이므로 +1)
            }
        }

        System.out.println(answer);
        */
    }
}
