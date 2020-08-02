package day14_Recap;
import java.util.Scanner;
public class nextLine_vs_Rest {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your age: ");

        int age = scan.nextInt();

        System.out.println("Enter your full name: ");

        scan.nextLine();
        String fullName = scan.nextLine();

        System.out.println(fullName + ", " + age);

    }

}
