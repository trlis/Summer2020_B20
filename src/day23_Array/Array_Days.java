package day23_Array;
import java.util.Scanner;
public class Array_Days {
    public static void main(String[] args) {

        System.out.println("Days\n");
        String[] day = new String[7];
        day[6] = "Sunday";
        day[1] = "Tuesday";
        day[4] = "Friday";
        day[3] = "Thursday";
        day[2] = "Wednesday";
        day[5] = "Saturday";
        day[0] = "Monday";

        for(int d = 0; d<= day.length-1; d++){
            System.out.println(day[d] + " ");
        }







    }
}
