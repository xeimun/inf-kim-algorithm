package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class a씨름선수 {
    static class Body implements Comparable<Body> {
        public int height;
        public int weight;

        public Body(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Body o) {
            return o.height - this.height;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Body> bodies = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int height = kb.nextInt();
            int weight = kb.nextInt();
            bodies.add(new Body(height, weight));
        }
        kb.close();

        int answer = 0;
        Collections.sort(bodies);
        int max = Integer.MIN_VALUE;
        for (Body b : bodies) {
            if (b.weight > max) {
                max = b.weight;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
