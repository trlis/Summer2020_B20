package day14_Recap;
import java.util.Scanner;
/*
 4. Write a program that asks user to enter the month number and returns the number of days in given month month (Assume that Feb has 28 days)
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12

                MUST use Scanner and nested IF

 */
public class warmUp4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the month number");

        int numMonth = scan.nextInt();

        if(numMonth>= 0 && numMonth < 12 && numMonth !=2){

            if(numMonth == 4 || numMonth == 6 || numMonth == 9 || numMonth == 11){
                System.out.println("30 days");
            }else {
                System.out.println("31 days");
            }

        }else{
            System.out.println("Invalid");
        }
    }


}
