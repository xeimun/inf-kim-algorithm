package Stack___Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class g교육과정설계 {
    public static void main(String[] args) {
        // 필수과목을 큐에 넣는 방식
        Scanner kb = new Scanner(System.in);
        String necessary = kb.nextLine();
        String plan = kb.nextLine();
        kb.close();

        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char c : necessary.toCharArray()) {
            queue.offer(c);
        }
        for (char c : plan.toCharArray()) {
            if (queue.contains(c)) {
                if (c != queue.poll()) {
                    answer = "NO";
                }
            }
        }
        if (!queue.isEmpty()) {
            answer = "NO";
        }

        System.out.println(answer);

        // 수업설계를 큐에 넣는 방식
        /*
        Scanner kb = new Scanner(System.in);
        String necessary = kb.nextLine();
        String plan = kb.nextLine();
        kb.close();

        char[] arr = necessary.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < plan.length(); i++) {
            queue.offer(plan.charAt(i));
        }

        int cnt = 0;
        for (char c : arr) {
            while (!queue.isEmpty()) {
                if (c == queue.poll()) {
                    cnt++;
                    break;
                }
            }
        }

        String answer = "NO";
        if (cnt == arr.length) {
            answer = "YES";
        }

        System.out.println(answer);
        */
    }
}
