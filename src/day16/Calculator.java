package day16;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        /*
        write a program to ask user to enter two numbers and a math operator
          ex:
            10
            20
            *
        output:
            200
            10
            2
            /
        output:
            5
    valid math operators are: *, / , +, -, %
    Nested If
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Enter first number");
        double num1 = input.nextDouble();

        System.out.println("Enter second number");
        double num2 = input.nextDouble();

        System.out.println("Enter math operator");
        char operator = input.next().charAt(0);

        boolean valid = operator == '*' || operator == '/' || operator == '%' || operator == '+' || operator == '-';
         if(valid){

             switch(operator){

                 case '*':
                     System.out.println(num1 * num2);
                     break;

                 case '/':
                     System.out.println(num1 / num2);
                     break;

                 case '%':
                     System.out.println(num1 % num2);
                     break;

                 case '+':
                     System.out.println(num1 + num2);
                     break;

                 default:
                     System.out.println(num1-num2);

             }


         }else{
             System.out.println("Invalid operator");
         }

        System.out.println();






    }
}
