package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Local_Times {

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

    public static void main(String[] args) {
        System.out.println("========");

       LocalTime t1 =  LocalTime.now();
       t1.plusHours(2);
       //  23>= hour >=0;
        // 59>=(min, sec)>=0
        System.out.println(t1);

        LocalTime now = LocalTime.now();
        System.out.println(now);

    }




}
