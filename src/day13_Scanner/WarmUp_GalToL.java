package day13_Scanner;
import java.util.Scanner;
public class WarmUp_GalToL {
    public static void main(String[] args) {
        /*
         4. write a program that can convert gallons to litters
                MUST use scanner
                1 gallon = 3.785l
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Enter amount of gallons to convert them into litters: ");

        double gal = input.nextDouble();
        System.out.println(gal + " gal = " + (gal * 3.875) + " L");
    }
}
