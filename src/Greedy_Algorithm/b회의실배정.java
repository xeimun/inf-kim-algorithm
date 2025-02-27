package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class b회의실배정 {
    static class Time implements Comparable<Time> {
        public int start;
        public int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            if (this.end == o.end) {
                return this.start - o.start;
            } else {
                return this.end - o.end;
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Time> times = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = kb.nextInt();
            int end = kb.nextInt();
            times.add(new Time(start, end));
        }
        kb.close();

        int answer = 0;
        Collections.sort(times);
        int end = Integer.MIN_VALUE;
        for (Time time : times) {
            if (time.start >= end) {
                answer++;
                end = time.end;
            }
        }

        System.out.println(answer);
    }
}
