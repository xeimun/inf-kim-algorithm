package HashMap___TreeSet;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class b아나그램 {
    public static void main(String[] args) {
        // 방법1 - HashMap 활용
        Scanner kb = new Scanner(System.in);
        String ana = kb.nextLine();
        String gram = kb.nextLine();
        kb.close();

        String answer = "YES";
        Map<Character, Integer> map = new TreeMap<>();
        for (char c : ana.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : gram.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                answer = "NO";
                break;
            }
            map.put(c, map.get(c) - 1);
        }

        System.out.println(answer);

        // 방법2 - Arrays 메소드 활용
        /*
        Scanner kb = new Scanner(System.in);
        String ana = kb.nextLine();
        String gram = kb.nextLine();
        kb.close();

        char[] anaArr = ana.toCharArray();
        char[] gramArr = gram.toCharArray();

        Arrays.sort(anaArr);
        Arrays.sort(gramArr);

        String answer = Arrays.equals(anaArr, gramArr) ? "YES" : "NO";

        System.out.println(answer);
        */
    }
}
