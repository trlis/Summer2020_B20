package day24;
import java.util.Scanner;
public class WarmUp1_Uniques {
    public static void main(String[] args) {
        /*
         1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd

         */
        //Better solution


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();

        String expectResult= "";

        for(int j = 0; j<= str.length()-1; j++) {
            char ch1 = str.charAt(j); //a
            int count = 0; //

            for (int i = 0; i <= str.length() - 1; i++) { //used for finding the frequency of ch1 and assign it

                char each = str.charAt(i);
                if (ch1 == each) {
                    count +=1;
                }
            }

            if (count == 1) { // if it only occur one time(unique)
                expectResult += ch1;

            }
        }

        System.out.println(expectResult);

    }
}
