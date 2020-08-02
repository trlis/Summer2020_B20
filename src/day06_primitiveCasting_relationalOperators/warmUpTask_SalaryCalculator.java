package day06_primitiveCasting_relationalOperators;
/*
  task04:
            Create a class called SalaryCalculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
                ex:
                    if: rate = 55;
                        stateTaxRate = 0.04;
                        federalTaxRate =0.22;
                        weeklyHours = 40;
                    then output will be:
                            your salary is: 105600 USD
                            your total tax is: 27456 USD
                            your income after tax is: 78144 USD
                Assume that a year has 48 weeks (excluding PTO)
 */

public class warmUpTask_SalaryCalculator {
    public static void main(String[] args) {

        double rate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate =0.22;
        int weeklyHours = 40;
        int weeks = 48;
        double salary = rate * weeklyHours * weeks;
        double totalTax = salary * (stateTaxRate + federalTaxRate);
        double salaryAfterTax = salary - totalTax;

        System.out.println("your salary is: " + salary + " USD");
        System.out.println("your total tax is: " + totalTax + " USD");
        System.out.println("your income after tax is: " + salaryAfterTax + " USD");

    }
}
