package day21_DoWhileLoop;
import java.util.Scanner;
public class WarmUpTask3 {
    public static void main(String[] args) {
        /*
         3. write a program that can divide two numbers without using / or % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                output: 3 with a remainder of 1

                10/3 = 3
                10-3 = 7
                7-3=4
                4-3 = 1 - remainder
         */

        Scanner input = new Scanner(System.in);

        int max = -999999;
        int min = 9999999;

        for(int i =1; i<=2; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt(); //10, 3

            if (num > max) {
                max = num;
            }
            if (num < max) {
                min = num;
            }

            if (min == 0) {
                System.out.println("Invalid Entry");
                System.exit(0);

            }
        }

            int count = 0;

            while (max > min) {
                max -= min;
                count++;
            }
            System.out.println(count + " with the remainder of " + max);




/*
            int a = 10;
            int b =3;

            if(b==0){
                System.out.println("Invalid input");
                System.exit(0);
            }


            int count = 0;

            while(a>b){
                a-=b; //a - numerator b- denominator
                count ++;
            }

        System.out.println(count  +" with the remainder of " + a);


*/

    }
}
