package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class d최대수입스케쥴 {
    static class Lecture implements Comparable<Lecture> {
        public int money;
        public int time;

        Lecture(int money, int time) {
            this.money = money;
            this.time = time;
        }

        @Override
        public int compareTo(Lecture o) {
            return o.time - this.time;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        List<Lecture> lectures = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int money = kb.nextInt();
            int time = kb.nextInt();
            lectures.add(new Lecture(money, time));
            max = Math.max(max, time);
        }
        kb.close();

        Collections.sort(lectures);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int answer = 0;

        int idx = 0;
        for (int time = max; time >= 1; time--) {
            for (; idx < n; idx++) {
                if (lectures.get(idx).time < time) {
                    break;
                }
                pq.offer(lectures.get(idx).money);
            }
            if (!pq.isEmpty()) {
                answer += pq.poll();
            }
        }
        System.out.println(answer);
    }
}
