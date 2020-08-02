package day34_WrapperClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WarmUp {
    public static void main(String[] args) {


        DateTimeFormatter dayTimeFormat = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime dayTime = LocalDateTime.now();
        System.out.println(dayTime.format(dayTimeFormat));


    }


}
