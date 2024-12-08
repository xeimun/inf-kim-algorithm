package String;

import java.util.Scanner;

public class c문장속단어 {
    public static void main(String[] args){
       Scanner kb = new Scanner(System.in);
       String input =  kb.nextLine();
       String[] arr = input.split(" ");
       String answer = "";
       for(String str : arr){
           if(str.length() > answer.length()){
               answer = str;
           }
       }
       System.out.println(answer);
     }
}
