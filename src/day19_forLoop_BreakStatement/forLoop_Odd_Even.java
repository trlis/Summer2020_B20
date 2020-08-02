package day19_forLoop_BreakStatement;

public class forLoop_Odd_Even {
    public static void main(String[] args) {

        System.out.println("=====   TASK 1  =======");
        /*
        1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
         */


        for (int num = 1; num <= 99; num += 2) {

            if (num % 3 == 0 && num % 5 == 0) {

                System.out.println(num);
            }

        }
        //2 solution


        for (int num1 = 0; num1 <= 100; num1++) {
            if (num1 % 2 != 0) {
                if (num1 % 3 == 0 && num1 % 5 == 0) {// sub: MUST be divisible by 3 & 5
                    System.out.println(num1 + " ");
                }
            }
        }


        System.out.println("\n=====   TASK 2  =======");
/*
        2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
*/
        for (int num2 = 0; num2 <= 100; num2++) {

            if (num2 % 2 == 0 && num2 % 3 == 0 && num2 % 5 == 0) {
                System.out.println(num2);
            }
        }

        System.out.println("\n=====   TASK 3  =======");
        /*
        3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
         */

        int add3 = 0;
        for (int num3 = 0; num3 <= 100; num3 += 2) {

            add3 = add3 + num3;
    }

            System.out.println(add3);

        System.out.println("\n=====   TASK 4  =======");
        /*
          4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
         */

        int sum4 = 0;
        for(int num4 = 1; num4<=100; num4 +=2)

    {

        if (num4 % 2 != 0) {
            sum4 += num4;
        }
    }
                System.out.println(sum4);

        System.out.println("\n=====   TASK 5  =======");
        /*
         5. Write a program that will print out all letters in English alphabet in ascending order
         */

        for(char letter = 'A'; letter<='Z'; letter++){
            System.out.print(letter);
        }
        System.out.println("");
        for (char letter5 = 65; letter5<=90; letter5++){
            System.out.print(letter5);
        }

        System.out.println("\n=====   TASK 6  =======");
        /*
          6. Write a program that will print out all letters in English alphabet in descedning order
         */

        for(char l6 = 'Z'; l6>='A'; l6--){
            System.out.print(l6);
        }
        System.out.println("");
        for(char l = 90; l>=65; l--){
            System.out.print(l);
        }

        }


    }
