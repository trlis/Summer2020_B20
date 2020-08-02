package day19_forLoop_BreakStatement;
import java.util.Scanner;

public class PALINDROME {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();

        String reversed = "";
        for(int l = str.length()-1; l >= 0; l--) {

            //reversed += str.charAt(l);
            reversed += str.substring(l, l+1);
        }

        System.out.println(reversed);
        System.out.println(str.equalsIgnoreCase(reversed));







    }
}
