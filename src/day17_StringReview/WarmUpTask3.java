package day17_StringReview;
import java.util.Scanner;

/*
3. Ask user to enter two words. Then add them together and print.
But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight

 */
public class WarmUpTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

/*       1st solution

         char ch1  = word1.charAt( word1.length() -1); //first char from the str1
         char ch2 = word1.charAt(0); //first char from str2

         if (ch1 == ch2){
             System.out.println(word1 + word2.substring(1));

         }else{
             System.out.println(word1 + word2);
*/

        // 2 solution

        String str1 = word1.substring(word1.length()-1);
        String str2 =word2.substring(0,1);

        if(str1.equals(str2)){
            System.out.println(word1 + word2.substring(1));
        }else{
            System.out.println(word1 + word2);
        }

         }

        }

