package day28_Recap;
import com.sun.org.apache.bcel.internal.generic.FSUB;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class FrequencyOfWordScan {
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

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine(); // "catcatcatcatdogdog"
        //(0,3)

        //1. create a var where you are gonna store the  frequency of the word we need
        int count = 0; //"cat"

        for (int i = 0; i <= str.length() - 6; i++) {
            if (str.substring(i, i + 6).equalsIgnoreCase("python")){
            count++;
        }
    }
        System.out.println(count);

    }





    }
