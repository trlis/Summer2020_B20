package day17_StringReview;
import java.util.Scanner;
/*

Warmup tasks:
1. Ask user to enter a word. If the word contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code

 */

public class WarmUpTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();


        if(word.startsWith("x")){
            System.out.println(word.replaceFirst("x", ""));
        }

    }
}
