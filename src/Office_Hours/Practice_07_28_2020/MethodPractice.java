package Office_Hours.Practice_07_28_2020;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class MethodPractice {
    //Access-Modifier   Specifier   Return Type   Name(Parameter) {Statements}
    /*
    //static allows to call the method
    //Return Method:
    //not void(DataType)-return the value that is reusable
    //void - only for executing the functionality



    Parameter - contains extra information - Mandatory if return type is not void


    Return statement -exits the method / return the value from the method

    */

    public static void main(String[] args) {
        // Reverse the String
        String str = "cat";
        String reversedString = reverseStr(str);
        System.out.println(reversedString);

        //Palindrome

        String PalindromeCheck = reverseStr(str);
        boolean palindrome =str.equalsIgnoreCase(PalindromeCheck);
        System.out.println((palindrome)? str + " is a palindrome" : str + " is not a palindrome");

        //Array

        String[] names = {"Aslan",  "Ramazan", "Alex", "Efran", "Aalia", "Ayhan"};

        String result ="";
        for(String eachName: names){
            System.out.println(reverseStr(eachName));
            }
        }

    public static String reverseStr (String str){

        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);



        }


        return result;
    }




}
