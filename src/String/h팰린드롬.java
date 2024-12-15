package String;

import java.util.Scanner;

public class h팰린드롬 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        kb.close();
        String tmp = str.toLowerCase()
                        .replaceAll("[^a-z]", "");
        int len = tmp.length();

        for (int i = 0; i < len / 2; i++) {
            if (tmp.charAt(i) != tmp.charAt(len - 1 - i)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}