package day15_String;
import java.util.Scanner;

public class BreakTask_UpperCaseName {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first name:");

        String firstName = input.next().toUpperCase();

        System.out.println("Enter your last name: ");

        String lastName = input.next().toUpperCase();


        System.out.println(firstName + " " + lastName);





    }
}
