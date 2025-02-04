package Sorting___Searching;

import java.util.Scanner;

public class i뮤직비디오 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int left = 0;
        int right = 0;
        int[] songs = new int[n];
        for (int i = 0; i < n; i++) {
            songs[i] = kb.nextInt();
            left = Math.max(left, songs[i]);
            right += songs[i];
        }
        kb.close();

        int answer = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            int count = 1;
            int sum = 0;

            for (int song : songs) {
                if (sum + song > mid) {
                    count++;
                    sum = song;
                } else {
                    sum += song;
                }
            }

            if (count <= m) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
