package Two_pointers___Sliding_window;

import java.util.Scanner;

public class a두배열합치기 {
    public static void main(String[] args) {
        // 방법 1 - Two pointers 알고리즘 활용
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }
        kb.close();

        int[] answer = new int[n + m];
        int p1 = 0;
        int p2 = 0;
        int index = 0;

        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) {
                answer[index++] = arr1[p1++];
            } else {
                answer[index++] = arr2[p2++];
            }
        }
        while (p1 < n) {
            answer[index++] = arr1[p1++];
        }
        while (p2 < m) {
            answer[index++] = arr2[p2++];
        }

        for (int num : answer) {
            System.out.print(num + " ");
        }

        // 방법 2 - stream 활용
        /*
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }
        kb.close();

        List<int[]> list = new ArrayList<>();
        list.add(arr1);
        list.add(arr2);

        int[] answer = list.stream()
                           .flatMapToInt(Arrays::stream)
                           .sorted()
                           .toArray();

        for (int num : answer) {
            System.out.print(num + " ");
        }
        */

        // 방법 3 - Arrays 메소드 활용
        /*
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }
        kb.close();

        int[] answer = Arrays.copyOf(arr1, n + m);
        for (int i = n; i < answer.length; i++) {
            answer[i] = arr2[i - n];
        }

        Arrays.sort(answer);

        for (int num : answer) {
            System.out.print(num + " ");
        }
        */
    }
}
