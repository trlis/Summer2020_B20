package Office_Hours.Practice_08_26_2020;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Palindrome1 {
    public static void main(String[] args) {

        String word = "level";
        String reversedWord = "";
        boolean palindrome;

        for(int i = word.length()-1; i>=0; i--){
            reversedWord+= word.charAt(i);

        }
        System.out.println(reversedWord.equalsIgnoreCase(word));


    }
}
