package day09_ifStatement;
/*
1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
 */
public class warmUpTask_MaxNum {

    public static void main(String[] args) {

        double num1 = 325;
        double num2 = 62;
        double num3 = 121;


        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the maximum number");
        }

        if ( num2 > num1 && num2 > num3){
            System.out.println( num2 + " is the maximum number");
        }
        if ( num3 > num1 && num3 > num2) {
            System.out.println( num3 + " is the maximum number");
        }
        System.out.println("-------------2-------------");

        boolean num1IsMax = num1 > num2 && num1 > num3;
        boolean num2IsMax = num1IsMax == false && num2 > num3;
        boolean num3IsMax = num1IsMax == false && num2IsMax == false;



        if(num1IsMax){
            System.out.println(num1 + " is the maximum number");
        }
        if(num2IsMax){
            System.out.println( num2 + " is the maximum number");
        }
        if (num3IsMax){
            System.out.println( num3 + " is the maximum number");
        }

        System.out.println("-------------3----------");

        double max= 0;

        if(num1IsMax) {
            max = num1;
        }

        if(num2IsMax){

            max = num2;
        }
        if (num3IsMax){

            max = num3;
        }

        System.out.println(max + " is the maximum number");

    }
}
