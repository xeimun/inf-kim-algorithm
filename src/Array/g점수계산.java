package Array;

import java.util.Scanner;

public class g점수계산 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();

        int sum = 0;
        int cnt = 0;
        for (int num : arr) {
            if (num == 1) {
                cnt++;
                sum += cnt;
            } else {
                cnt = 0;
            }
        }

        System.out.println(sum);
    }
}
