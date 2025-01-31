package Stack___Queue;

import java.util.Scanner;
import java.util.Stack;

public class d후위식연산 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String postfix = kb.nextLine();
        kb.close();

        Stack<Double> numbers = new Stack<>();
        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.push((double) (c - '0'));
            } else {
                double num1 = numbers.pop();
                double num2 = numbers.pop();
                switch (c) {
                    case '+':
                        numbers.push(num2 + num1);
                        break;
                    case '-':
                        numbers.push(num2 - num1);
                        break;
                    case '*':
                        numbers.push(num2 * num1);
                        break;
                    case '/':
                        numbers.push(num2 / num1);
                        break;
                }
            }
        }

        System.out.println(numbers.pop()
                                  .intValue());
    }
}
