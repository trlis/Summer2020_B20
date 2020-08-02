package day21_DoWhileLoop;
import java.util.Scanner;
public class WarmUpTask_MaxNum {
    public static void main(String[] args) {
        /*
        WarmUp tasks:
    1. write a program that asks user to enter 5 numbers and return the maximum number

         */

        Scanner input = new Scanner(System.in);

        int max = -2147483648; //30,
      for(int i = 10; i<=50; i+=10) {
          System.out.println("Enter a number");
          int num = input.nextInt(); //10, 20 , 30 , 20,

          if(num> max){ //if this condition is true we will assign "max" to "num"
              max=num;
          }
      }

        System.out.println(max);

            }
        }


