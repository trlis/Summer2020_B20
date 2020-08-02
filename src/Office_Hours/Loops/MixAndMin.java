package Office_Hours.Loops;
import java.util.Scanner;
public class MixAndMin {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int min = 999999999;
        int max= -999999999;
        for(int n = 1; n<=5; n++) {
            System.out.println("Enter a number:");
            int num = input.nextInt();

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}
