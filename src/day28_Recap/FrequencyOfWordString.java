package day28_Recap;
import  java.util.Scanner;
public class FrequencyOfWordString {
    public static void main(String[] args) {
        /*
        1. write a program return the frequency of a word from a string
            ex:
                str = "Javajava";
                word = "java";
                output:
                    3
        do not use same the approach we did in last office hour
         */

       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.next();
        */

        String str = "javajava";
        //substring(0,4) ==> java *
        //substring(1,5) ==> avaj
        //substring(2,6) ==> vaja
        //substring(3,7) ==> ajav
        //substring(4,8) ==> java *

        //substring(i, i+4) - inn order to call this substring we need a String

        //java
        int count = 0;

        for(int i = 0; i <=str.length()-4; i++){ // i: 0,1,2,3,4,5,6,7


            String s = str.substring(i, i + 4); // if we remove num from i, make sure to remove it from length
            if(s. equalsIgnoreCase("java")){
                count ++;
            }


        }

        System.out.println(count);





    }
}
