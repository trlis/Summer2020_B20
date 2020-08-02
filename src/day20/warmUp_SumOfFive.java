package day20;
import java.util.Scanner;
public class warmUp_SumOfFive {
    public static void main(String[] args) {

        /*
         2. write a program that can ask the user enter a number for five times
          and the returns the sum of those five numbers

         */

        Scanner input = new Scanner(System.in);
        int sum = 0; //10 + 20 + 30 + 40 +50
        for(int i = 10; i <= 50; i += 10) {

            System.out.println("Enter any five numbers:");
            int num = input.nextInt(); //10 //20 //30 //40 //50
            sum += num;
        }
        System.out.println("Sum of the numbers: " + sum);










    }
}
