package String;

import java.util.Scanner;

public class k문자열압축 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        kb.close();

        StringBuilder answer = new StringBuilder();
        char tmp = str.charAt(0);
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == tmp) {
                count++;
            } else {
                answer.append(tmp);
                if (count > 1) {
                    answer.append(count);
                }
                tmp = c;
                count = 1;
            }
        }

        answer.append(tmp);
        if (count > 1) {
            answer.append(count);
        }

        System.out.println(answer);
    }
}
