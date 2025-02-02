package Sorting___Searching;

import java.util.Scanner;

public class eLRU {
    public static void main(String[] args) {
        // 배열 + 삽입정렬
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] work = new int[n];
        for (int i = 0; i < n; i++) {
            work[i] = kb.nextInt();
        }
        kb.close();

        int[] cache = new int[s];
        for (int x : work) {
            int index = -1;
            for (int i = 0; i < s; i++) {
                if (cache[i] == x) {
                    index = i;
                }
            }
            if (index == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = index; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }

        for (int i : cache) {
            System.out.print(i + " ");
        }

        // LinkedList 메소드
        /*
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] work = new int[n];
        for (int i = 0; i < n; i++) {
            work[i] = kb.nextInt();
        }
        kb.close();

        LinkedList<Integer> cache = new LinkedList<>();
        for (int i : work) {
            if (cache.contains(i)) {
                cache.remove(Integer.valueOf(i));
            } else if (cache.size() == s) {
                cache.removeFirst();
            }
            cache.addLast(i);
        }

        Collections.reverse(cache);
        for (int i : cache) {
            System.out.print(i + " ");
        }
        */
    }
}
