package day09_ifStatement;
/*
2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
 */
public class warmUpTask_MinNum {

    public static void main(String[] args) {

        double num1 = 156;
        double num2 = 466;
        double num3 = 84;

        boolean num1Min = num1 < num2 && num1 < num3;
        boolean num2Min = !num1Min && num2 < num3;
        boolean num3Min = !num1Min && !num2Min;

        double min = 0;

        if (num1Min){
            min = num1;
        }
        if(num2Min){
            min = num2;
        }
        if(num3Min){
            min = num3;
        }
        System.out.println(min + " is the minimum number");


    }
}
