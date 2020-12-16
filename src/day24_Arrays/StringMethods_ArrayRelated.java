package day24_Arrays;

import java.util.Arrays;

public class StringMethods_ArrayRelated {
    public static void main(String[] args) {

            /*
    String methods:

            String str = "ABCD"
            toCharArray(): returns char array.

            str.toCharArray() ==> ['A', 'B', 'C', 'D', 'E']

            split(value): returns String Array, splits the string by given value;
            String sentence  = "Java is cool"

            sentence.split(" ") => ["Java", "is", "cool"]


     */

        String str = "ABCDEFGHIJ";
       char[] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("================================");
        //Compare if two given arrays are the same(contain same data)
        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[] ch1= str1.toCharArray(); //[D, C, E, B, A]
        char[] ch2 = str2.toCharArray(); // [A, D, C, B, A]

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean r1 = Arrays.equals(ch1, ch2);
        System.out.println(r1);

        System.out.println("================================");

        //Task.Reverse the string to get the output: Language Programming Love I
        String sentence = "I Love Programming Language";

        String[] words = sentence.split(" "); // {I, Love, Programming, Language}
        System.out.println(Arrays.toString(words));

        for(int i = words.length-1; i>0; i--){
            System.out.print(words[i] + " ");
        }

        System.out.println("================================");
        String s = "JAVA";
        String[] arr = s.split(""); //every element is related to string
        System.out.println(Arrays.toString(arr));

        char[] c = s.toCharArray(); // every element is a char
        System.out.println(Arrays.toString(c));




    }


}
