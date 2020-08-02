package day28_Recap;
import java.util.Scanner;
public class FrequencyOfWordArrayScan {
    public static void main(String[] args) {

          /*
        2. write a program that can count the frequency of a word from an array of string
            Ex:
                arr: {"Java", "C#", "Python", "Java"};
                word: "java"
                output: 2

            MUST USE for each loop and continue statement
         */

        Scanner input = new Scanner(System.in);
        System.out.println("How many words do you want to store into the array?");
        int num = input.nextInt();

        System.out.println("Enter a word to find a frequency of");
        String word = input.next();

        String[] arr = {"Java", "C#", "Python", "Java"};
        String word1= "java";

        int count = 0;

        for(String each: arr){
            if(word.equalsIgnoreCase(each)) {
                count++;

            }
        }
        System.out.println(count);






    }
}
