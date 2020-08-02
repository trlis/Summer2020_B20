package day13_Scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
public class WarmUp_TaxCalculator {
    public static void main(String[] args) {
        /*
        5. write a program that can calculate the state tax, federal tax and salary after tax
                needed information:
                                annual salary
                                state tax rate
                                federal tax rate
                MUST use Scanner
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your annual salary: ");
        int salary = input.nextInt(); //10000

        System.out.println("Enter your state tax rate: ");
        double stateTaxRate = input.nextDouble();//0.08
        double stateTax = salary * stateTaxRate;

        System.out.println("Enter your federal tax rate: ");
        double fedTaxRate = input.nextDouble(); //0.2
        double federalTax = salary * fedTaxRate;

        double salaryAfterTax = salary - (stateTax + federalTax);

        System.out.println("Your annual salary: $" + salary );
        System.out.println("Your state tax: $" + stateTax);
        System.out.println("Federal Tax: $" + federalTax);
        System.out.println("Your salary after Tax: $" + salaryAfterTax);









    }
}
