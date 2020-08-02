package day14_Recap;

import java.util.Scanner;
/*
 2. write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102
 */
public class warmUp2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the building number: ");
        int building = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter the street address: ");
        String street = scan.nextLine();

        System.out.println("Enter the city name: ");
        String city = scan.next();

        System.out.println("Enter the state name");
        String state = scan.next();

        System.out.println("Enter zip code");
        int zip = scan.nextInt();


        scan.nextLine();
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println(" Ship to: " + fullName);
        System.out.println("\t\t"+building + " " + street);
        System.out.println( "\t\t" + city + ", " + state + " " + zip);



    }
}
