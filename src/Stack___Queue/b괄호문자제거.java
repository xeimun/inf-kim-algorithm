package Stack___Queue;

import java.util.Scanner;
import java.util.Stack;

public class b괄호문자제거 {
    public static void main(String[] args) {
        // 방법1 - Stack을 사용하여 괄호 안의 문자들을 모두 제거하는 방식
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        kb.close();

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ')') {
                while (stack.pop() != '(') {
                }
            } else {
                stack.push(input.charAt(i));
            }
        }

        for (char c : stack) {
            System.out.print(c);
        }

        // 방법2 - Stack을 사용하여 괄호 쌍만 제거하고 괄호 바깥의 문자들을 실시간으로 출력하는 방식
        /*
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        kb.close();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty()) {
                stack.pop();
            } else if (c != '(' && c != ')' && stack.isEmpty()) {
                System.out.print(input.charAt(i));
            }
        }
        */
    }
}
