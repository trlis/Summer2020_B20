package day16;
import  java.util.Scanner;
public class WarmUpTask1 {
    public static void main(String[] args) {

        /*
        warmup tasks:
    1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana


         */



        String str = "I like to drink Pepsi";
        //            0123456789...........

        String drink = str.substring(16);
        System.out.println(drink);
        System.out.println("=====================");

        String Str = "I like to drink Pepsi";
        //            0123456789...........

        String Action = str.substring(10,15);
        System.out.println(Action);

        System.out.println("=====================");


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String str1 = input.next(); //Apple

        System.out.println("Enter the second word:");
        String str2 = input.next(); //Banana


        //String res = str1.substring(1).concat(str2.substring(1));
        String res = str1.substring(1) + str2.substring(1);
        System.out.println(res);






    }
}
