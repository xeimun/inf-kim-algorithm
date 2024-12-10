package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class d단어뒤집기 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int wordCount = kb.nextInt();

        List<String> words = new ArrayList<>();
        for(int i =0; i < wordCount; i++){
            String word = kb.next();
            words.add(word);
        }

        for(String word : words){
            StringBuilder reverseWord = new StringBuilder(word);
            System.out.println(reverseWord.reverse());
        }

        kb.close();
    }
}