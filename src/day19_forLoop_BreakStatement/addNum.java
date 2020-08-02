package day19_forLoop_BreakStatement;
import java.util.Scanner;
public class addNum {
    public static void main(String[] args) {
        /*

    7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
            output: 1275
         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the point number");
        int endNum = scan.nextInt();

        int sum7 = 0;
        if (endNum >1) {
            for (int num = 1; num <= endNum; num++) {
                sum7 += num;
            }

            System.out.println(sum7);
        }else{
            System.out.println("Invalid Entry");
        }
    }
}
