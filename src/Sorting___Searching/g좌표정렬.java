package Sorting___Searching;

import java.util.Arrays;
import java.util.Scanner;

class Point implements Comparable<Point> {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}

public class g좌표정렬 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        Point[] arr = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr[i] = new Point(x, y);
        }
        kb.close();

        Arrays.sort(arr);
        for (Point i : arr) {
            System.out.println(i.x + " " + i.y);
        }

    }
}
