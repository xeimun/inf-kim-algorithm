package String;

import java.util.Scanner;

/*
대소문자를 구분하지 않고 문자를 비교하기 위해서는 대소문자를 맞추는 것이 필요합니다.
그 이유는 자바에서 문자의 비교는 기본적으로 유니코드 값을 기준으로 하기 때문입니다.
대문자 'A'와 소문자 'a'는 서로 다른 유니코드 값을 가지고 있기 때문에,
이를 같은 문자로 간주하려면 대소문자를 맞춰서 비교해야 합니다.
 */

public class a문자찾기 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        char c = kb.nextLine().charAt(0);

        String upperStr = str.toUpperCase();
        Character upperChar = Character.toUpperCase(c);
        int answer = 0;

        for(char x : upperStr.toCharArray()){
            if(x == upperChar){
                answer++;
            }
        }

        System.out.println(answer);

        kb.close();
    }
}
