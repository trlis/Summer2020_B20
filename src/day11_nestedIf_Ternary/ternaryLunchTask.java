package day11_nestedIf_Ternary;

public class ternaryLunchTask {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;


        String r = (a > b) ? "a is greater" : (b == a )?" b and a are equal" : "b is greater";
        System.out.println(r);

        System.out.println("===================================================");
    /*
warmUp task:
    1. write a java program that can convert numbers between 0 ~ 9 to words,
     if the number is greater than 9 or less than zero, out put should be "Invalid". 1 --> one etc.

    2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
 */
        int digit = 8;
        String num = "";

        String numResult = (digit == 0)? "Zero": (digit == 1)? "One": (digit == 2)? "Two":
                (digit == 3)? "Three": (digit == 4)? "Four": (digit == 5)? "Five":
                                             (digit == 6)? "Six":(digit == 7)? "Seven": (digit == 8)? "Eight":
                                                     (digit == 9)? "Nine" : "Invalid";
        System.out.println(numResult);


    }

}