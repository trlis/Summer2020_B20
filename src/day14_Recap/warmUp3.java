package day14_Recap;
import java.util.Scanner;
/*
 3. write a program that asked the user enter the age and based on the input
  the program should be able to check if the person is eligible to buy alcohol
                if age is > 21 , print "here is your wine"
                if age is < 21, print "get out kid"
                if age is invalid, print "Invalid Entry"
                MUST use Scanner and nested IF
 */

public class warmUp3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if (age >= 0) {

            if (age >= 21) {
                System.out.println("Here is your wine");
            } else {
                System.out.println("Get out kid");
            }

        } else {

            System.out.println("Invalid Entry");
        }
    }
}

