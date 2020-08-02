package day22_NestedLoop;
import java.util.Scanner;
public class PasswordInput {
    public static void main(String[] args) {

        /*
        1. Write a program that asks user to enter his/her username and password until user enters  correctly.
                there are only three attempts
                after three attempts:  lock the account

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a username:");
        String un = input.next();

        System.out.println("Enter a password:");
        String pswd = input.next();

        int attempt = 1;


            while (!(pswd.equals("CybertekB20!") && un.equals("trlis"))) {
                System.out.println("Invalid name or password, please re-enter");
                attempt++;
            }
                if (attempt == 3) {
                    System.out.println("Your account is blocked");
                    System.exit(0);
                }

        System.out.println("Invalid name or password, please re-enter");
        System.out.println("Enter a username:");
        un = input.next();

        System.out.println("Enter a password:");
        pswd = input.next();





                }



            }


