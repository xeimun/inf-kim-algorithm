package String;

import java.util.Scanner;

public class l암호 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        String str = kb.next();
        kb.close();

        StringBuilder answer = new StringBuilder();

        // 암호 해석
        for (int i = 0; i < cnt; i++) {
            // 1. 문자 구분
            String code = str.substring(i * 7, i * 7 + 7);

            // 2. #은 이진수의 1로, *은 이진수의 0으로 변환
            code = code.replace('#', '1')
                       .replace('*', '0');

            // 3. 2진수를 10진수로 변환
            int decimal = Integer.parseInt(code, 2);

            // 4. 10진수 숫자에 해당하는 아스키번호 문자로 변환
            char alphabet = (char) decimal;

            // 5. 문자 이어붙이기
            answer.append(alphabet);
        }

        System.out.println(answer);
    }
}
