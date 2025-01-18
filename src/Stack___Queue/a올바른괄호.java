package Stack___Queue;

import java.util.Scanner;
import java.util.Stack;

public class a올바른괄호 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String bracket = kb.nextLine();
        kb.close();

        Stack<Character> stack = new Stack<>();
        for (char c : bracket.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();

            }
        }

        if (!stack.isEmpty()) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
    }
}
