package day13_Scanner;
import java.util.Scanner;

public class WarmUp_KgToLbs {

    public static void main(String[] args) {

        /*

    3. write a program that can convert Kg to lb
                MUST use Scanner
       1kg = 2.2 lbs

         */

        Scanner input = new Scanner (System.in);
        System.out.println("Enter weight in kg:");

        double kg = input.nextDouble();

        System.out.println(kg + " kg = " + (kg * 2.2) + " lbs");


    }

}
