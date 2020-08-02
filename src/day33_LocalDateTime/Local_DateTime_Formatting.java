package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.function.DoubleToIntFunction;

public class Local_DateTime_Formatting {

    /*
    LocalDateTime : combination of LocalDate & localTime

    year-month-day  hour:min:sec (sec/nano sec- are not required)

    year: yy, yyyy
    month: MM(number), MMM(3 letters ), MMMM(month's full name)
    day: dd
    days name: E(three letters), EEEE(full name)

    hours: hh
    minutes: mm
    seconds: ss
    am/pm : a


    Date formats:
                month/day/year
                day/month/year

    Time formats:
                am, pm


     */
    public static void main(String[] args) {



        LocalDateTime t3 = LocalDateTime.of(2020, 07,25,15,2);
        System.out.println(t3);

        LocalDateTime t4 = LocalDateTime.now();
        System.out.println(t4);

        System.out.println("=============== Formating ====================");

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM/EEEE/yyyy");

        LocalDate ld = LocalDate.of(2020, 7, 25);
        System.out.println(ld);
        System.out.println(ld.format(dateFormat));


        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));

        System.out.println("=====================================================");
        //  MAy/20/DayName 4:30pm

        DateTimeFormatter dateTime= DateTimeFormatter.ofPattern("MMMM/dd/yyyy EEEE hh:mm a");
        LocalDateTime dt =LocalDateTime.of(2000, 4, 24, 5, 15);
        System.out.println(dt.format(dateTime));


        LocalDateTime rightNow =LocalDateTime.now();
        System.out.println(rightNow.format(dateTime));


        DateTimeFormatter rNowFormat = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime rNow = LocalDateTime.now();
        System.out.println(rNow.format(rNowFormat));








    }
}
