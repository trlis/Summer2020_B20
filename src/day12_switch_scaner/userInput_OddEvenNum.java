package day12_switch_scaner;
/*

 */
import java.util.Scanner;

public class userInput_OddEvenNum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");

        double num = scan.nextDouble();

        String result = "";

        result = (num%2 == 0)? num + " Number is even": num + " Number is odd ";
        System.out.println(result);







    }

}
