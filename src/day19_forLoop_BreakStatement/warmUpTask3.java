package day19_forLoop_BreakStatement;

/*

    4. write a program that can calculate the sum of all numbers between 1 to 100
    5. write a program that can calculate the sum of all the even numbers between 1 ~ 100
    6. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
    7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
            output: 1275
            input : 200
            output : 20100

 */

public class warmUpTask3 {
    public static void main(String[] args) {

        System.out.println("========= TASK 4 ========= ");

        int num4 = 1;
        int add = 0;

        for( num4 =1 ; num4<=100; num4++){
            add = add + num4;
            System.out.println(add);
        }

        System.out.println("\n========= TASK 5 ========= ");

       int add5 = 0;
         for(int num5 =1 ; num5<=100; num5++){


             if(num5%2 == 0) {

                 add5 = add5 + num5;

                 System.out.println(add5);



             }
         }

    }
}
