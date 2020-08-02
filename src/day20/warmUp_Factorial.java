package day20;
import java.util.Scanner;
public class warmUp_Factorial {
    public static void main(String[] args) {
        /*
        4. Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120
         */
        int multipl = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

            for (int num1 = 1; num1 <= num; num1++) {
                multipl *= num1;
            }
            System.out.println(multipl);


    }
}


