package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class c결혼식 {
    static class Time implements Comparable<Time> {
        public int time;
        public char state;

        Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time o) {
            if (this.time == o.time) {
                return this.state - o.state;
            } else {
                return this.time - o.time;
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time> times = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int startTime = kb.nextInt();
            int endTime = kb.nextInt();
            times.add(new Time(startTime, 's'));
            times.add(new Time(endTime, 'e'));
        }
        kb.close();

        Collections.sort(times);
        int answer = 0;
        int cnt = 0;
        for (Time time : times) {
            if (time.state == 's') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }
}
