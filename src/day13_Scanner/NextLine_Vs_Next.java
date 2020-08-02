package day13_Scanner;
import java.util.Scanner;
public class NextLine_Vs_Next {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); //120000Enter

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble(); //120000

        scan.nextLine(); // we use it to take out "Enter" that is left in the Scanner
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine(); // Enter

        System.out.println("Salary: " + salary);
        System.out.println("Full name: " + fullName);
    }
}

//Disadvantage of the nextLine method  occurs only if you're using it after the first next Method
