package day15_String;
import java.util.Scanner;

public class Practice_charAt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();
        char firstN = firstName.charAt(0);

        System.out.println("Enter your last name:");
        String lastName = input.next();
        char lastN = lastName.charAt(0);

        System.out.println("Your initials are: " + firstN + "." + lastN +".");
    }
}
