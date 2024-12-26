package Array;

import java.util.Scanner;

public class f뒤집은소수 {
    public static void main(String[] args) {
        // 방법1 - 수학 계산을 활용한 숫자 뒤집기 + 입력한 숫자가 소수 인지 일일이 확인
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        // 숫자를 입력받아 뒤집고 배열에 저장
        for (int i = 0; i < n; i++) {
            int input = kb.nextInt();
            int res = 0;
            while (input > 0) {
                int tmp = input % 10; // 마지막 자리(1의 자리) 숫자 추출
                res = res * 10 + tmp; // 숫자 뒤집기
                input = input / 10; // 마지막 자리(1의 자리) 제거
            }
            arr[i] = res;
        }

        // 소수 판별 및 출력
        for (int num : arr) {
            boolean flag = true;
            if (num == 1) {
                flag = false;
            } else {
                // 2부터 num-1까지 나누어 소수 여부 확인
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.print(num + " ");
            }
        }

        // 방법2 - StringBuilder를 활용한 숫자 뒤집기 + 에라토스테네스의 체를 사용하여 소수를 한 번만 계산
        /*
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        // 숫자를 입력받아 뒤집고 배열에 저장
        for (int i = 0; i < n; i++) {
            int a = kb.nextInt();
            StringBuilder b = new StringBuilder(String.valueOf(a));
            String c = b.reverse()
                        .toString();
            arr[i] = Integer.parseInt(c);
        }
        kb.close();

        // 배열에서 가장 큰 값을 찾아 에라토스테네스의 체를 생성할 크기를 결정
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // 에라토스테네스의 체를 사용하여 소수 판별
        int[] tmp = new int[max + 1];
        tmp[1] = 1; // 1은 소수가 아님
        for (int i = 2; i < tmp.length; i++) {
            if (tmp[i] == 0) {
                for (int j = i * 2; j < tmp.length; j += i) {
                    tmp[j] = 1;
                }
            }
        }

        // 뒤집힌 숫자가 소수인지 확인하고 출력
        for (int num : arr) {
            if (tmp[num] == 0) {
                System.out.print(num + " ");
            }
        }
        */
    }
}
