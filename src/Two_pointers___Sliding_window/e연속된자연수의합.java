package Two_pointers___Sliding_window;

import java.util.Scanner;

public class e연속된자연수의합 {
    public static void main(String[] args) {
        // 방법1 - 수학
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();

        int answer = 0;
        int cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n -= cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }
        
        System.out.println(answer);

        // 방법2 - two pointers
        /*
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.close();

        int answer = 0;
        int sum = 0;
        int start = 1;
        int end = 1;

        while (end <= n / 2 + 1) {
            sum += end++;
            while (sum > n) {
                sum -= start++;
            }
            if (sum == n) {
                answer++;
            }
        }

        System.out.println(answer);
        */
    }
}
