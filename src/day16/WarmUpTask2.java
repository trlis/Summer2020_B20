package day16;
import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {
        /*
         2. Ask user to enter a word. Print true if the first and last characters of the string
          are same characters, print false otherwise.
            Input:
                abba
            Output:
                true


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();

      String str1 = word.substring(0,1);
        int lastIndexNum = word.length()-1;
        char last = word.charAt(lastIndexNum);

        String str2 = word.substring(word.length()-1);

        if(str1.equals(str2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }




        }






    }
