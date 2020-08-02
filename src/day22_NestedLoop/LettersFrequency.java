package day22_NestedLoop;
import java.util.Scanner;
public class LettersFrequency {
    public static void main(String[] args) {

    /*

    2. Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4
                Input: ABCC
                       C
                Output: 2

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.println("Enter a character:");
        String ch = input.next();

       int count = 0;


       String result = "";
        for(int w = 0; w <= str.length()-1; w++){

            String word = "" + str.charAt(w);

            if(word.contains(ch)) {
                count+=1;


            }

            }

        System.out.println(count);

        }
    }

