package Stack___Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class h응급실 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        Queue<int[]> queue = new LinkedList<>();
        Queue<Integer> queueSort = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int risk = kb.nextInt();
            queue.offer(new int[]{risk, i});
            queueSort.offer(risk);
        }
        kb.close();

        int answer = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            if (current[0] == queueSort.peek()) {
                queueSort.poll();
                answer++;
                if (current[1] == m) {
                    System.out.println(answer);
                    return;
                }
            } else {
                queue.offer(current);
            }
        }
    }
}
