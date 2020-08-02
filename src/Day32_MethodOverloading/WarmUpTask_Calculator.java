package Day32_MethodOverloading;
import java.util.Scanner;

/*
 2. write a return method that accepts two numbers and an operator, then returns calculation result.
             if the operator is invalid, return zero
             otherwise return the result
 */
public class WarmUpTask_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = input.nextDouble();
        System.out.println("Enter operator:");
        char operator = input.next().charAt(0);
        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();


        double calculate = calculator(num1, operator, num2);
        System.out.println(calculate);



    }
    public static double calculator(double num1, char operator, double num2){



    double result = (operator == '+')? num1 + num2 :(operator == '-')? num1-num2 :(operator =='*')? num1*num2:
    (operator =='/')? num1/num2 :(operator == '%')? num1%num2 : 0;

        return  result;


    }
    /*
        double result = 0;
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1-num2;
                break;

            case '*':
                result = num1*num2;
                break;

            case '/':
                result =num1/num2;
                break;

            case '%':
                result = num1%num2;
                break;

            default:
                System.out.println("invalid operator");
                System.exit(0);

}

     */

    }


