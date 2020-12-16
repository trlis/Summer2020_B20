package Office_Hours.Practice_08_26_2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Palindrome2 {
    public static void main(String[] args) {


        String str = "level";

        System.out.println(str.equalsIgnoreCase(reverseStr(str)));
        System.out.println(isPalindrome("Ana"));
        System.out.println(isPalindrome("Fatih"));


    }

public static String reverseStr(String str) {
    String reversedStr = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        reversedStr += str.charAt(i);

    }
        return reversedStr;
    }
    public static  boolean isPalindrome(String str){
        return  str.equalsIgnoreCase(reverseStr(str));
    }

}