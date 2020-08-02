package day23_Array;
import java.util.Scanner;
public class warmUp_Addition {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = num1 + num2;
            System.out.println(result);

            System.out.println("Do you want to continue?");
            String a = input.next();

            while (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.out.println("Invalid answer, please enter yes or no");
                System.out.println("Do you want to continue?");
                a = input.next();
            }


                if (a.equalsIgnoreCase("no")) {
                    System.out.println(result);
                    break;
                }
            }



    }
}
