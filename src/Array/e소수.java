package Array;

import java.util.Scanner;

public class e소수 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] arr = new int[n + 1];
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= n; j += i) {
                    arr[j] = 1;
                }
            }
        }
        System.out.println(answer);
    }
}
