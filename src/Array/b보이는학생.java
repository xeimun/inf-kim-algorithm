package Array;

import java.util.Scanner;

public class b보이는학생 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        kb.close();

        int answer = 0;
        int tmp = 0;
        for (int height : arr) {
            if (height > tmp) {
                tmp = height;
                answer++;
            }
        }
        
        System.out.println(answer);
    }
}
