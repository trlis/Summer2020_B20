package day23_Array;

import java.util.Scanner;
public class warmUp2_Bedroom {
    public static void main(String[] args) {
     /*
        2. write a program for the room reservation:
        King Bed ==> 120$
        Queen Bed ==> 100$
        single Bed ==> 80$

        the program asks the user which bedroom does he/she wants to reserve and calculats the total price
        and then the program will ask:
        do you want to reserve another room:
        if yes ==> repeat the previous steps
        if no ==> your total price is: $$$
        while answer is neither yes or no ==> please re-enter
        HINT: nested loop task, outter loop need to be an infinite loop

         */

        Scanner input = new Scanner(System.in);

        int kingBed = 120;
        int queenBed = 100;
        int singleBed = 80;
        String total = "";


        for (int n = 1; n >= 1; n++) {
            System.out.println("Welcome to Cybertek Inn");
            System.out.println("which bedroom do you want to reserve? ");
            String room = input.nextLine();


            if (room.equalsIgnoreCase("King Bed")) {
                total = "" + kingBed + " $";
            } else if (room.equalsIgnoreCase("Queen Bed")) {
                total = "" + queenBed + " $";
            } else {
                total = "" + singleBed + " $";
            }
            System.out.println(total);


            for (int i = 1; i >= 1; i++){
                System.out.println("Do you want another room? ");

            if (input.equals("no")) {
                System.out.println(total);

            } else {

            }
        }
    }}

        }


