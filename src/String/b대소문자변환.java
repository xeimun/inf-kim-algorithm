package String;

import java.util.Scanner;

/*

 */

public class b대소문자변환 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        StringBuilder result = new StringBuilder();

        for(char x : str.toCharArray()) {
            if (Character.isUpperCase(x)) {
                result.append(Character.toLowerCase(x));
            } else {
                result.append(Character.toUpperCase(x));
            }
        }

        String answer = result.toString();
        System.out.println(answer);

        kb.close();
    }
}
