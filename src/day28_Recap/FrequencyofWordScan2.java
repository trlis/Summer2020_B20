package day28_Recap;

import java.util.Scanner;

public class FrequencyofWordScan2 {
    public static void main(String[] args) {


            /*
        1. write a program return the frequency of a word from a string
            ex:
                str = "Javajava";
                word = "java";
                output:
                    3
        do not use same the approach we did in last office hour
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();

        System.out.println("Enter a word to find a frequency of");
        String word = input.next();

        int l = word.length();
        // "catcatcatcatdogdog"
        //(0,3)

        //1. create a var where you are gonna store the  frequency of the word we need
        int count = 0; //"cat"

        for (int i = 0; i <= str.length() -l; i++) {
            if (str.substring(i, i + l).equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println(count);

    }
}
