package day19_forLoop_BreakStatement;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:"); //cat ==> tac
                                              // 0123    210
        String str = scan.nextLine();

        String result = "";


        for( int n = str.length()-1; n >= 0; n-- ) {
            result += str.charAt(n);
        }
            System.out.print(result);

    }
}
