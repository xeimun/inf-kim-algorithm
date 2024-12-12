package String;

import java.util.Scanner;

public class e특정문자뒤집기 {
    public static void main(String[] args) {

        // 강의와 다른 풀이
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        kb.close();

        // 특수문자 제외한 알파벳만 추출
        String pureStr = str.replaceAll("[^a-zA-z]", "");
        StringBuilder reversedStr = new StringBuilder().append(pureStr)
                                                       .reverse();

        for (int i = 0; i < str.length(); i++) {
            // 원본 문자열에서 특수문자를 찾아 수정된 문자열에 차례로 삽입
            if (!str.substring(i, i + 1)
                    .matches("[a-zA-z]")) {
                reversedStr.insert(i, str.charAt(i));
            }
        }

        System.out.println(reversedStr);

        // 강의 풀이
        /*
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char[] strArr = str.toCharArray();
        int lt = 0;
        int rt = strArr.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(strArr[lt])) {
                lt++;
                continue;
            }
            if (!Character.isAlphabetic(strArr[rt])) {
                rt--;
                continue;
            }
            char tmp = strArr[lt];
            strArr[lt] = strArr[rt];
            strArr[rt] = tmp;
            lt++;
            rt--;
        }

        System.out.println(String.valueOf(strArr));
        kb.close();
         */
    }
}
