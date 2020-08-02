package day13_Scanner;
import java.util.Scanner;
public class Next_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        System.out.println("Enter your gender: ");
        String gender = scan.next();

        String fullName = firstName + ""  + lastName;

        System.out.println("Hello " + fullName + ", you are " + gender );




    }
}
