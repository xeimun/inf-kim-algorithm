package String;

import java.util.Scanner;

public class j가장짧은문자거리 {
    public static void main(String[] args) {
        // 방법1 - 강의 풀이
        // 입력 받기
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char t = kb.next()
                   .charAt(0);
        kb.close();

        int[] arr = new int[s.length()];
        int distance = 100; // 큰 값으로 초기화

        // 왼쪽에서부터 문자 t와의 거리 계산
        for (int i = 0; i < arr.length; i++) {
            if (s.charAt(i) == t) {
                distance = 0;
                arr[i] = distance;
            } else {
                distance++;
                arr[i] = distance;
            }
        }
        distance = 100; // 큰 값으로 초기화

        // 오른쪽에서부터 문자 t와의 거리 계산 (최소 거리로 업데이트)
        for (int i = arr.length - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                distance = 0;
            } else {
                distance++;
                arr[i] = Math.min(arr[i], distance);
            }
        }

        // 결과 출력
        for (int tmp : arr) {
            System.out.print(tmp + " ");
        }

        // 방법2 - 내가 한 풀이
        /*
        // 입력 받기
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char t = kb.next()
                   .charAt(0);
        kb.close();

        char[] cArr = s.toCharArray(); // 문자열을 문자 배열로 변환
        List<Integer> tIndex = new ArrayList<>(); // 문자 t의 위치 인덱스를 저장할 리스트

        // 문자 t의 인덱스 찾기
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == t) {
                tIndex.add(i);
            }
        }

        // 각 문자와 문자 t의 최소 거리 계산
        for (int i = 0; i < cArr.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int idx : tIndex) {
                int distance = Math.abs(i - idx);
                if (distance < min) {
                    min = distance;
                }
            }
            System.out.print(min + " ");
        }
        */
    }
}
