package day03_sequences_variables;

public class SalaryCalculator {
    /*
     task
           variables: salary, tax
           totalTax = salary * tax
           salaryAfterTax = salary - totalTax
     */
    public static void main(String[] args){

        int salary = 100000;
        double tax = 0.28;
        double totalTax = salary * tax;
        double salaryAfterTax = salary - totalTax;


//method 1
        System.out.println(salary * tax); //totalTax
        System.out.println(salaryAfterTax);

        //method 2
        System.out.println(salary - salary * tax);

    }


}
