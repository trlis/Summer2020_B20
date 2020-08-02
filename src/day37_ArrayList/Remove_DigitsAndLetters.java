package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_DigitsAndLetters {
    public static void main(String[] args) {
        /*

    3. write a program that can remove digits and letters for an ArrayList of characters
            list: {a,b,c,3,4,5,6,&,%,@,#,*}
            output: {&,%,@,#,*};

         */
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a','b','c','3','4','5','6','&','%','@','#','*'));

        list.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(list);

        System.out.println("======================================================");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','b','c','3','4','5','6','&','%','@','#','*'));

        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> specialChar = new ArrayList<>();

        digits.addAll(chars);
        System.out.println(digits);

        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println(digits);

        letters.addAll(chars);

        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println(letters);

        specialChar.addAll(chars);
        specialChar.removeAll(letters);
        specialChar.removeAll(digits);

        System.out.println(specialChar);




    }
}

