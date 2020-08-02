package day15_String;

import java.lang.String;
import java.util.Scanner;

public class string_Intro {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        String name = "Cybertek"; // String literal
        String name1 = new String("Cybertek");

        /*
        Difference - memory location
        Any object is being saved into the Java Heap(memory location in Java)

        String pool - special memory location for all string literals
         */

      /*
     If we're using any class that presented in "java.lang" package from the System library no import is needed.
     It'll be imported automatically

    Any other package has to be imported explicitly
    -----------------------------------------------------------------------------------------------------------------


    In order to use a String we have to have an object of the string.

                     2 ways of creating String objects:
          -----------------------------------------------------------
          |  1.String literals                                      |
          |                 String name = "Cybertek";               |
          |                                                         |
          |  2.By new keyword                                       |
          |                 String name2 = new String("Cybertek");  |
          -----------------------------------------------------------

     All String literals stored in the String pool(in the Java Heap memory)
     All other objects stored in the Heap Memory (outside the String pool)

     Java Heap - memory location where all the objects stored at

     String Pool designed only for the String Literals

     THERE IS NO DUPLICATION IN THE STRING POOL. OBJECTS THAT ARE THE SAME WILL BE STORED AS ONE OBJECT

    */

        String s1 = "Cat";
        String s2 = "Cat";
        System.out.println(s1 == s2); //true. 1 Object "Cat" saved in the string pool

        String d1 = "Dog";
        String d2 = "dog";
        System.out.println(d1== d2); //false.
        // 2 Objects were created in the pool memory since Java is a case sensitive language

        String t1 = new String("Tiger");
        String t2 = new String("Tiger");
        System.out.println(t1 == t2); // false.
        // Every time when we use the new keyword to create  string new object id created in different location

        String c1 = "Cybertek";  //String pool
        String c2 = new String("Cybertek"); //String Heap
        String c3 = new String ("Cybertek"); // String Heap
        String c4 = "Cybertek"; // String pool
        String c5 = "cybertek"; //"Cybertek" != "cybertek"


        System.out.println(c1 == c2); //false
        System.out.println(c2 == c3); //false
        System.out.println(c1 == c3 ); //false
        System.out.println(c1==c4); //true. c1 and c4 Stored in the String pool as one object
        System.out.println(c4==c5); //false because of the case sensitivity. Created two different objects


        /*
        String is IMMUTABLE

        Once you created the object you will not be able to modify it, it cannot be changed
        ether it was created as a string literal or by new keyword

        Once string object is created its data or state can not be changed but a new string object is created.
        */

        String str1 = "Java"; //Once the object of String is created there is o way we can modify it
        str1 = "Java Script"; // Here we reassigned it. Str1 now referencing to "Java Script"
        System.out.println(str1); //Java Script

        str1 = "Java";
        System.out.println(str1);//Java

        /*
        3.String is the sequence of characters

        Variables' names stored in the stack memory


        Each character of the string has an Index number.
        index: sterting from 0

        String str = "Cybertek 123$"
        index:        123456789....

         */


    }
}
