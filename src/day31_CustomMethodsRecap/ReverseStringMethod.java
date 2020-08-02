package day31_CustomMethodsRecap;

import java.awt.*;

public class ReverseStringMethod {
    public static void main(String[] args) {

        String str1 = "Cat";
        reversedString(str1);

        String str = "Level";
        String revStr =reversedStr(str);

        System.out.println(str.equalsIgnoreCase(revStr));

    }

    public static void reversedString(String str1) {

        String expectedRes = "";
        for (int i = str1.length() - 1; i >= 0; i++) {
            char each = str1.charAt(i);
            expectedRes += each;

        }
        System.out.println(expectedRes);

    }

    public static String reversedStr(String str) {

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i++) {
            char ch = str.charAt(i);
            reversed += ch;

        }
        return reversed;

    }
}