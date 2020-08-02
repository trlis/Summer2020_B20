package Office_Hours.StringReverse_ForAndWhileLoops;
import com.sun.corba.se.spi.orbutil.threadpool.NoSuchThreadPoolException;

import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine(); //"Batch20"
/*
        String result = "";

        for (int ch = str.length() - 1; ch >= 0; ch--) {

            result += str.charAt(ch);

        }
        System.out.println(result);
*/
        String result = "";

        int numOfChar = str.length()-1;
        while(numOfChar>=0){
            result += str.charAt(numOfChar);
            numOfChar--;

        }
        System.out.println(result);


    }
    }
