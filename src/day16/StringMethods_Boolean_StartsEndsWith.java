package day16;

public class StringMethods_Boolean_StartsEndsWith {

    public static void main(String[] args) {

        //startsWith(): checks if the string starts with the giving string

        String s1 = "Lisa";
        System.out.println(s1.startsWith("L"));  // true
        System.out.println(s1.startsWith("J"));  // false
        System.out.println(s1.startsWith("Li")); // true
        System.out.println(s1.startsWith("LI")); // false
        System.out.println(s1.startsWith("Ar")); // false


        //endsWith(): checks if the string ends with the giving string

    }
}
