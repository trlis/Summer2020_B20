package day09_ifStatement;
/*
3. write a java program that accepts three numbers and return the medium number
                (assume that none of them are equal)
 */
public class warmUpTask_MediumNum {

    public static void main(String[] args) {

        double num1 = 1;
        double num2 = 456;
        double num3 = 6;

        boolean medNum1 = (num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3);
        boolean medNum2 = (num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3);
        boolean medNum3 = !medNum1 && !medNum2;

        double med = 0;

        if (medNum1){
            med = num1;
        }
        if (medNum2){
            med = num2;
        }
        if (medNum3){
            med = num3;
        }
        System.out.println(med + " is the medium number");

    }
}
