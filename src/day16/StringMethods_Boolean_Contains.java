package day16;

public class StringMethods_Boolean_Contains {
    public static void main(String[] args) {

        //contains(): checks if the given string contains

        String str  = "I like to learn java programming language";
        System.out.println(str.contains("python")); // false
        System.out.println(str.contains("java")); //true
        System.out.println(str.contains("JAVA")); //false


        String str1  = "I like to learn python and java programming languages";
        System.out.println(str1.contains("python")); // true

        String str2  = "I like to learn java programming language";
        System.out.println(!str2.contains("python")); //true



    }
}
