package day17_StringReview;
import java.util.Scanner;

/*
4. write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method

 */
public class WarmUpTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = input.next();

        System.out.println("Enter last name");
        String lastName = input.next();

        //System.out.println("Your initials: " + firstName.charAt(0) + "." + lastName.charAt(0));


        System.out.println((firstName.substring(0,1) + "." + lastName.substring(0,1) + ".").toUpperCase());

    }
}
