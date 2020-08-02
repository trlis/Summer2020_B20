package day20;
import java.util.Scanner;
public class WarmUp_UntilNegative {
    public static void main(String[] args) {
        /*
         3. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop

         */

        Scanner input = new Scanner(System.in);

        int sum = 0;

        for(int i = 0; i == 0;) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if(num<0){
                break;
            }
            sum += num;
            System.out.println(sum);

        }
    }
}
