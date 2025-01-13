package HashMap___TreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class a학급회장 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        kb.close();

        Map<Character, Integer> voteCnt = new HashMap<>();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            voteCnt.put(str.charAt(i), voteCnt.getOrDefault(str.charAt(i), 0) + 1);
        }
        int max = 0;
        char answer = ' ';
        for (Map.Entry<Character, Integer> m : voteCnt.entrySet()) {
            if (m.getValue() > max) {
                max = m.getValue();
                answer = m.getKey();
            }
        }

        System.out.println(answer);
    }
}
