package day16;
import java.util.Scanner;
public class StringMethods_Boolean_equals_IgnoreEquals {

    public static void main(String[] args) {


        //equals(): checks if the string has the same text with the given string, returns boolean
        //cant ignore case sensetivity

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1 + ":" + str2);
        System.out.println(str1 == str2); //false

        System.out.println(str1.equals(str2));

        String str3 = new String("Java");
        String str4 = new String("Java");
        // str3 and str4 are different objects saved in the different locations in the Java Heap memory.


        System.out.println(str3 == str4); //false
        System.out.println(str3.equals(str4)); //true

        String str5 = "Java";
        String str6 = "Java";
        // str5 and str6 are saved in the String pool as a one object

        System.out.println(str5 == str6); //true
        System.out.println(str5.equals(str6)); //true

        //cant ignore case sensitivity
        String str7 = "JAVA";
        String str8 = "Java";
        System.out.println(str7.equals(str8)); //false

        System.out.println("============================================");

        // equalsIgnoreCase():
        //Ignores
        String str9 = "JAVA";
        String str10 = "Java";
        System.out.println(str7.equals(str8)); //true

        System.out.println("============= Practice ==============");

        //ask the user if he/she is employed, otherwise ==> unemployed

        Scanner input = new Scanner(System.in);
        System.out.println("Are you employed? If yes, print \"yes\" ");
        String answ = input.next();
        // String answ = input.next().toLowerCase();

          if(answ.equalsIgnoreCase("yes")){
              System.out.println("Employed");
          }else {
              System.out.println("Not employed");
          }







    }
}
