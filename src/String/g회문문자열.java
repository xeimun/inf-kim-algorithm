package String;

import java.util.Scanner;

public class g회문문자열 {
    public static void main(String[] args) {
        // 방법 1 - StingBuilder reverse() 메소드
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        kb.close();
        String tmp = new StringBuilder(str).reverse()
                                           .toString();

        if (!str.equalsIgnoreCase(tmp)) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");

        // 방법 2 - charAt() 메소드
        /*
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        int len = str.length();
        str = str.toLowerCase();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
        kb.close();
        */
    }
}