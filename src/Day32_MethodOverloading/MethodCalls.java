package Day32_MethodOverloading;

import Library.Util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {

        String firstName = "elKEm";
        String lastName = "emeT";

        String fullName = Util.formatFullName(firstName, lastName);
        System.out.println(fullName);

        String uniques = Util.uniques(fullName.toLowerCase());
        System.out.println(uniques);

        String reversedName = Util.reverse(fullName);
        System.out.println(reversedName);

        System.out.println("=============================================");

        int [] a = {200, 400, 150, 500, 200, 50, 40 ,400, 30 , 60, 78 };
        int n = 24;

        int[] newArr = Util.addElement(a, n);
        System.out.println(Arrays.toString(newArr));



    }
}
