package day09_ifStatement;
/*
Task01:
	 write a program that can check if number is positive negative or equals to zero.

	 	for example:
			num  = 1

			prints:
				1 is positive number

			num = -6

			print:
				6 is negative number


			num = 0

			print:
				zero

 */
public class warmUpTask {

    public static void main(String[] args) {

        int num1 = 1;
        if (num1 > 0 == true){

            System.out.println( num1 + " is positive number");
        }
        if (num1 < 0 == true){

            System.out.println(num1 + " is negative number");
        }
        if (num1 == 0 == true){

            System.out.println(num1 + " is zero");
        }

        int num2 = -6;
        if (num2 > 0 == true){

            System.out.println(num2 + " is positive number");
        }
        if (num2 < 0 == true){

            System.out.println(num2 + " is negative number");
        }
        if (num2 == 0 == true){

            System.out.println( num2 + "zero");
        }

        int num3 = 0;
        if (num3 > 0 == true){

            System.out.println(num3 +  " is positive number ");
        }
        if (num3 < 0 == true){

            System.out.println(num3 + " is negative number");
        }
        if  (num3 == 0 == true){
            System.out.println(num3 + " is zero");
        }


    }
}
