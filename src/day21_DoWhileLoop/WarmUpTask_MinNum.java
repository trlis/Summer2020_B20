package day21_DoWhileLoop;
import java.util.Scanner;
public class WarmUpTask_MinNum {
    public static void main(String[] args) {
        /*
        2. write a program that asks user to enter 5 numbers and returns the minimum number

         */
        Scanner input = new Scanner(System.in);

        int min = 999999999; //5
        for (int n =1; n<= 5; n++){
            System.out.println("Enter a number");
            int num = input.nextInt(); //5, 5, 12, 0,

            if(num<min){
                min= num;
            }

        }
        System.out.println(min);


    }
}
