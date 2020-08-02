package day15_String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class StringMethods_length {
    public static void main(String[] args) {

     /*
    length(): returns the total number of the characters in the string(returns as an int)
     */

        String name = "Cybertek School is a great place"; //15 characters
            //index:   012345678910111213141516

        int l = name.length();
        System.out.println(l);

        //last index: length of String -1
        int lastIndexNum = name.length() -1;
        System.out.println(lastIndexNum);
         char lastChar = name.charAt(14);
        System.out.println(lastChar);




    }





}
