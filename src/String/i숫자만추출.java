package String;

import java.util.Scanner;

public class i숫자만추출 {
    public static void main(String[] args) {
        // 방법1 - 아스키 번호
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        kb.close();

        int answer = 0;
        for (char tmp : str.toCharArray()) {
            if (Character.isDigit(tmp)) {
                answer = answer * 10 + (tmp - '0');
            }
        }

        System.out.println(answer);

        // 방법2 - 문자열
        /*
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        kb.close();

        StringBuilder numString = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            char tmp = str.charAt(i);
            if (Character.isDigit(tmp)) {
                numString.append(tmp);
            }
        }

        int answer = Integer.parseInt(numString.toString());
        System.out.println(answer);
        */
    }
}
