package day31_CustomMethodsRecap;

import Library.Util;

/*
warmup tasks:
    1.  write a return method called frequency that accepts two parameters: string str and char ch, the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
            please copy paste the method to the util class
    2. use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
            Ex:
                uniques("ABBC");       ==> "AC"
                uniques("Cybertek");   ==> "cybrtk"
                please copy paste the method to the util class

 */
public class WarmUpTasks {
    public static void main(String[] args) {


        // Task 1
        String str = "aabccd";
        String str2 = "ppolllsklklcjjya cvcncmx";

        int freq = frequency(str, 'a');
        System.out.println("'A' frequency is: " + freq);


        //Task 2
        String uniqueChars = uniques(str2);
        System.out.println(uniqueChars);


        //Task 3



    }

    //Task 1
    // -takes a string and a char
    //returns frequency of the char from the string as an int
    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }

        return count;
    }

    //Task 2
    public static String uniques(String str) {

        String uniques = ""; //"bd"
        for (char eachChar : str.toCharArray()) {
            int count = frequency(str, eachChar);
            if (count == 1) {
                uniques += eachChar;
            }


        }
        return uniques;
    }




}