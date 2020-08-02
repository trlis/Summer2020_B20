package day24;
import java.util.Scanner;
public class WarmUp1_UniqueChar {
    /*
     1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();

        String  uniques = "";
        for(int l =0; l<= str.length()-1; l++){

           char ch = str.charAt(l);

           int first = str.indexOf(ch);
           int last = str.lastIndexOf(ch);

           if(first == last){
               uniques += ch;


           }

        }

        System.out.println(uniques);

    }
}
