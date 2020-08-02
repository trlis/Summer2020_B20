package day33_LocalDateTime;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Local_Date {
    public static void main(String[] args) {

        /*
        LocalDate: year-month-date

        methods:
            declare:
                of(year, month, day)


        LocalTime: hours:minutes:seconds

        methods:
            declare:
                of(hours, min, sec)
                24h


         */

        LocalDate DOB = LocalDate.of(2000, 4, 24);
        System.out.println(DOB);

        LocalDate today =LocalDate.now();
        System.out.println(today);

        LocalDate y = LocalDate.of(2019, 1, 1);
        boolean result = y.isLeapYear();
        System.out.println(result);

        boolean res = y.isLeapYear();
        System.out.println(res);

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a year");
        int year  = scan.nextInt();

        boolean result2 = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(result2);
        System.out.println("=======================================");
        System.out.println("Enter birth year, birth month, birth date");

        LocalDate d = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println(d);
        System.out.println(d.isLeapYear());






    }
}
