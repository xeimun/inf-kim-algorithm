package DFS___BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class o피자배달거리 {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n;
    static int m;
    static int len;
    static int answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> hs = new ArrayList<>();
    static ArrayList<Point> pz = new ArrayList<>();

    public static void DFS(int idx, int s) {
        if (idx == m) {
            int sum = 0;
            for (Point h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(sum, answer);
        } else {
            for (int i = s; i < len; i++) {
                combi[idx] = i;
                DFS(idx + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = kb.nextInt();
                if (tmp == 1) {
                    hs.add(new Point(i, j));
                } else if (tmp == 2) {
                    pz.add(new Point(i, j));
                }
            }
        }

        len = pz.size();
        combi = new int[m];
        DFS(0, 0);
        System.out.println(answer);
    }
}
