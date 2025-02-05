package Sorting___Searching;

import java.util.Arrays;
import java.util.Scanner;

public class j마구간정하기 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 마구간 개수
        int c = kb.nextInt(); // 말의 수
        int[] stalls = new int[n];
        for (int i = 0; i < n; i++) {
            stalls[i] = kb.nextInt();
        }
        kb.close();

        Arrays.sort(stalls);
        int left = 1; // 최소 거리 (말을 배치할 수 있는 가장 작은 거리)
        int right = stalls[stalls.length - 1] - stalls[0]; // 최대 거리 (가장 먼 두 마구간 거리)
        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int horsePosition = stalls[0]; // 첫 번째 말의 위치
            int count = 1; // 첫 번째 말을 배치
            boolean flag = false;

            for (int i = 1; i < stalls.length; i++) {
                if (stalls[i] - horsePosition >= mid) {
                    horsePosition = stalls[i]; // 말을 배치한 위치 갱신
                    count++;
                }
                if (count == c) {
                    flag = true;
                }
            }

            if (flag) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
