package Sorting___Searching;

import java.util.Arrays;
import java.util.Scanner;

public class e중복확인 {
    public static void main(String[] args) {
        // 배열 활용
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();

        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                answer = "D";
            }
        }

        System.out.println(answer);

        // set 활용
        /*
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(kb.nextInt());
        }
        kb.close();

        String answer = "U";
        if (set.size() != n) {
            answer = "D";
        }

        System.out.println(answer);
        */
    }
}
