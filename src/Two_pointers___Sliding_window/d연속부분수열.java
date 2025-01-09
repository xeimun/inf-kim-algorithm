package Two_pointers___Sliding_window;

import java.util.Scanner;

public class d연속부분수열 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();

        int answer = 0;
        int sum = 0;
        int start = 0;
        int end = 0;

        while (end < n) {
            sum += arr[end++];
            while (sum > m) {
                sum -= arr[start++];
            }
            if (sum == m) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
