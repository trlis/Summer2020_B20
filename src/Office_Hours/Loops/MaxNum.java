package Office_Hours.Loops;
import java.util.Scanner;
public class MaxNum {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
       //Max num

        int max = -99999999;
       for(int n = 1; n<=5; n++) {
           System.out.println("Enter a number");
           int num = input.nextInt();


           if (num > max) {
               max = num;
           }
       }

        System.out.println("The maximum number is: "  +max);


        System.out.println("======== While Loop ========");

        Scanner scan = new Scanner (System.in);

        int max1 = -9999999;
        int i = 1;
        while(i<=5) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            i++;

            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);

            }
        }



