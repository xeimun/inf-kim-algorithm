package Stack___Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class c크레인인형뽑기 {
    public static void main(String[] args) {
        // 입력 처리
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = kb.nextInt();
        }
        kb.close();

        // 스택 초기화
        List<Stack<Integer>> stacks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stacks.add(new Stack<>());
            for (int j = n - 1; j >= 0; j--) {
                if (board[j][i] != 0) {
                    stacks.get(i)
                          .push(board[j][i]);
                }
            }
        }

        // 게임 로직
        Stack<Integer> basket = new Stack<>();
        int answer = 0;

        for (int move : moves) {
            Stack<Integer> stack = stacks.get(move - 1);
            if (stack.isEmpty()) {
                continue;
            }

            int doll = stack.pop();
            if (!basket.isEmpty() && doll == basket.peek()) {
                basket.pop();
                answer += 2;
            } else {
                basket.push(doll);
            }
        }

        System.out.println(answer);
    }
}
