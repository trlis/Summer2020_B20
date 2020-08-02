package day29_CustomMethods;
import java.util.Scanner;

/*
    9. write a method that can check if a string is palindrome, print true if it's  otherwise print false

 */
public class Task9_Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word"); // radar
        String str = input.next();

       palindrome(str);


    }

    public static void palindrome( String str){


        String result = "";
        for(int i=str.length()-1; i>=0; i--) {
            String letter = "" + str.charAt(i);
            result += letter;
        }

            if(str.equalsIgnoreCase(result)){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
    }
