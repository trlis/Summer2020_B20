package day16;
import java.util.Scanner;
public class WarmUpTask4 {
    public static void main(String[] args) {
        /*
        4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.nextLine();

        System.out.println("Enter first word");
        String word2 = input.nextLine();

        System.out.println("Enter first word");
        String word3 = input.nextLine();

        boolean allTheSame = word1.length() == word2.length() && word1.length() == word3.length();
        boolean allDifferent =word1.length() != word2.length() && word2.length() == word3.length() && word1.length() == word3.length();


        if (allTheSame){
            System.out.println("All words are same length");
        }else if(allDifferent){
            System.out.println("All different length");

        }else{
            System.out.println("Not Same nor Different lengths");
        }



    }
}
