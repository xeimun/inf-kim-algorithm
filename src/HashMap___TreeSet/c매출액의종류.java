package HashMap___TreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class c매출액의종류 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();

        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int start = 0;
        for (int end = k - 1; end < n; end++) {
            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);
            answer.add(map.size());

            map.put(arr[start], map.get(arr[start]) - 1);
            if (map.get(arr[start]) == 0) {
                map.remove(arr[start]);
            }
            start++;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
