package day12_switch_scaner;
/*
3. write a program for the rate calculator
            1. asks the user to enter the salary (as double)
            2. asks the user how many hours does he/she works in a week (as int)
            3. print the hourly rate of the employee
            assume that one year has 52 weeks
            hourRate = salary/ (weeklyHour * 52)

 */
import java.util.Scanner;

public class userInput_rateCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        System.out.println("Enter the amount of hours you work in a week: ");
        int hrsPerWeek = input.nextInt();
        int totalHrs = hrsPerWeek * 52;


        double hourlyRate = salary / totalHrs;

        System.out.println("Your hourly rate is: $" + hourlyRate);

    }

}
