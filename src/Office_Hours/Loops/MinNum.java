package Office_Hours.Loops;
import com.sun.corba.se.spi.orbutil.threadpool.NoSuchThreadPoolException;

import java.rmi.UnexpectedException;
import java.util.Scanner;
public class MinNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 999999999;
        for(int n = 1; n<=5; n++) {
            System.out.println("Enter a number:");
            int num = input.nextInt();

            if(num<min){
                min=num;
            }

        }
        System.out.println("The minimum number is: " +  min);

        System.out.println("\n===== While Loop =========");

        Scanner scan = new Scanner (System.in);

        int min1 = 2147483647;
        //whatever users enter it will ALWAYS be less than 2147483647
        int n =1;
        while(n<=5) {
            System.out.println("Enter a number:");
            int num1 = scan.nextInt();
            n++;

            if(num1<min1){
                min1=num1;
            }

        }

        System.out.println("The minimum number is: " + min1);





    }
}
