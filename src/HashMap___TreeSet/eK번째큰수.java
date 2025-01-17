package HashMap___TreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class eK번째큰수 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();

        int answer = -1;
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int l = j + 1; l < arr.length; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x : set) {
            cnt++;
            if (cnt == k) {
                answer = x;
            }
        }

        System.out.println(answer);
    }
}
