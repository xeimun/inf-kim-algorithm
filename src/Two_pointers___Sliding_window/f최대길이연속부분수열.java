package Two_pointers___Sliding_window;

import java.util.Scanner;

public class f최대길이연속부분수열 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();

        int answer = 0;
        int start = 0;
        int zeroCnt = 0;

        for (int end = 0; end < n; end++) {
            if (arr[end] == 0) {
                zeroCnt++;
            }

            while (zeroCnt > k) {
                if (arr[start] == 0) {
                    zeroCnt--;
                }
                start++;
            }

            answer = Math.max(answer, end - start + 1);
        }

        System.out.println(answer);
    }
}
