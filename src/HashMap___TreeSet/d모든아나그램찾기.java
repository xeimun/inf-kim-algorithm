package HashMap___TreeSet;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class d모든아나그램찾기 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        String t = kb.nextLine();
        kb.close();

        int lenS = s.length();
        int lenT = t.length();
        Map<Character, Integer> mapT = new TreeMap<>();
        Map<Character, Integer> mapS = new TreeMap<>();
        for (int i = 0; i < lenT; i++) {
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (int i = 0; i < lenT - 1; i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
        }

        int answer = 0;
        int start = 0;
        for (int end = lenT - 1; end < lenS; end++) {
            mapS.put(s.charAt(end), mapS.getOrDefault(s.charAt(end), 0) + 1);
            if (mapT.equals(mapS)) {
                answer++;
            }

            mapS.put(s.charAt(start), mapS.get(s.charAt(start)) - 1);
            if (mapS.get(s.charAt(start)) == 0) {
                mapS.remove(s.charAt(start));
            }
            start++;
        }

        System.out.println(answer);
    }
}
