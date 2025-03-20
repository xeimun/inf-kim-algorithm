package Dynamic_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class d가장높은탑쌓기 {
    static class Brick implements Comparable<Brick> {
        int s;
        int h;
        int w;

        public Brick(int s, int h, int w) {
            this.s = s;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Brick o) {
            return o.s - this.s;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] dy = new int[n];
        List<Brick> bricks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            bricks.add(new Brick(a, b, c));
        }

        int answer = 0;
        Collections.sort(bricks);
        dy[0] = bricks.get(0).h;
        answer = dy[0];
        for (int i = 1; i < n; i++) {
            int maxH = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (bricks.get(j).w > bricks.get(i).w) {
                    maxH = Math.max(maxH, dy[j]);
                }
            }
            dy[i] = maxH + bricks.get(i).h;
            answer = Math.max(answer, dy[i]);
        }

        System.out.println(answer);
    }
}
