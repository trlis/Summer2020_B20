package day53_FinalKeyword;

import java.time.LocalDate;

public class FinalVariable {

    final static String eyeColor = "Brown";
    final String bloodType ="A";

   // final int x;  final instance variables need to be initialized right away
   // final static int y;


    final static int y;
    static {
        y = 300;
    }
/*
    final int x;

    public FinalVariable(){
        x = 700;

*/


    public static void main(String[] args) {

        final LocalDate DOB = LocalDate.of(2000, 5, 7);

       // DOB = LocalDate.of(1990,6,5);  can not be reassigned

        System.out.println(DOB);

        long ssn = 123536;

        System.out.println(ssn);

        final long Ssn  =2354656;
        System.out.println(Ssn);

        final double PI = 3.14;
        System.out.println(PI);
        //PI = 2.14

        final char gender = 'F';
        //gender = 'F';

        final String birthPlace = "Kazakhstan";
        //birthPlace = "Russia";

        System.out.println(birthPlace);


    }
}
