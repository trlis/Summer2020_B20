package day16;
import java.util.Scanner;
public class WarmUpTask3 {
    public static void main(String[] args) {
        /*
        3. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than 3 characters, print the string itself

         */

        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter a string:");

        String str = input.nextLine();

        int strLength = str.length();
/*
        if(strLength == 0){
            System.out.println("String is empty");
        }else if (strLength > 3){
            System.out.println(str.substring(strLength - 3 ));
        }else{
            System.out.println(str);
        }
*/

        String result = (str.length() == 0)? "empty string": (str.length() > 3)? str.substring(strLength - 3) :
             str;
        System.out.println(result);



    }
}
