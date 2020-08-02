package day37_ArrayList;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Tasks {
    /*
    1. write a program that can find the unique characters from the string
       DO not use Nested loop

      String :  "ABABCDEE"
      output:    C D


     */
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A', 'B', 'A', 'B', 'C', 'D', 'E','E'));

        for(char each: list) {
            int count = Collections.frequency(list, each);

            if (count == 1) {
                System.out.print(each);
            }

        }
        System.out.println();
        System.out.println("================ Task 2 ========================");

        /*
        2. write a program that can find the frequency of character from the String
        DO not use Nested loop

        String:  "AABBCCDDEE"
        output:   A2B2C2D2E2

       */

        ArrayList<Character> charList = new ArrayList<>();
        list.addAll(Arrays.asList('A', 'A','B', 'B', 'C', 'C', 'D', 'D', 'E', 'E'));

        ArrayList<Character> charFreq = new ArrayList<>();

        for(char each: charList) {
            // charList.get(i);
            int count = Collections.frequency(charList, each);

;
        }



        }






    }

