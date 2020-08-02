package day23_Array;
import java.util.Scanner;
public class warmUp1_Addition_myVersion {
    public static void main(String[] args) {
        /*
        WarmUp tasks:
    1. write a program that will ask user to enter two numbers and calculates the sum of those two numbers.
       then it asks the user if he/she wants to continue
               - if the answer is yes, repeat the whole process again
               - if the answer is no, only return the addition
                but while the answer is not a valid answer (not yes or no), the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outer loop need to be an infinite loop
   */

        Scanner input = new Scanner(System.in);


        int sum = 0;

        for (int o = 1; o <= 2; o--) {
            for (int n = 1; n <= 2; n++) {
                System.out.println("Enter a number");
                int num = input.nextInt();
                sum += num;


            }

            System.out.println("" + sum);
            System.out.println("Do you want to continue?");
            String answ = input.next();




            if (answ.equalsIgnoreCase("yes")) {


            } else {
                System.out.println("" + sum);
                break;
            }
                }
            }
        }

 /*
    if (answ.equalsIgnoreCase("yes") || answ.equalsIgnoreCase("no")) {

            if (answ.equalsIgnoreCase("yes")) {

            } else if (answ.equalsIgnoreCase("no")) {
            System.out.println("" + sum);
            break;

            } else {

            System.out.println("Do you want to continue?");

*/

/*
 if (answ.equalsIgnoreCase("yes")) {


                } else {
                        System.out.println("" + sum);
                        break;
                }
 */