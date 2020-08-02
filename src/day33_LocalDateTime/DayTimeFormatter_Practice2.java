package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayTimeFormatter_Practice2 {
    public static void main(String[] args) {


        String[] students = {"Fatih", "Kevser", "Kalbinur", "Andrei", "Isa"};

        LocalDate[] dob = {LocalDate.of(1982, 12, 26),
                LocalDate.of(1985, 12, 3),
                LocalDate.of(1987, 6, 24),
                LocalDate.of(1972, 10, 3),
                LocalDate.of(1982, 11, 28)};

        DateTimeFormatter dobFormat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");
        for (int i = 0; i <= students.length - 1; i++) {
            System.out.println(students[i] + "'s Birthday: " + dob[i].format(dobFormat));


        }


    }




}
