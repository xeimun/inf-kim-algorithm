package Array;

import java.util.Scanner;

public class a큰수출력하기 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = kb.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();

        System.out.print(arr[0] + " ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}