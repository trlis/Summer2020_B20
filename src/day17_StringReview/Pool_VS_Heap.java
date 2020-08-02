package day17_StringReview;

public class Pool_VS_Heap {
    public static void main(String[] args) {

     /*String - class presented in a java.lang package: sequences of characters(Text). Creates an OBJECT. IMMUTABLE.

         Immutability means that once object is declared it can not be changed. Even if you call it with methods like
         toUpperCase, toLowerCase, they are not able to modify the original String object.
         They are gonna return a new String.

                 2 ways to create an object:

          1.String literal :

          String str = "School";
          Saved in the String pool, Java heap memory(Memory location: String pool)

          String str1 = "School";
          str and str1 are the same object in the String pool. One object was created.

          2.new keyword :

          String str2 = new String ("School");
          Saved in the Java Heap memory; - new object will be created;

          String str3 = new String ("School"); - new object will be created;
          str1 and str2 are two different objects saved in different locations of the Heap memory.


          For the compiler it easier to find an object from the String Pool rather that from the whole Heap memory since
          in Heap memory stored rest of the classes' objects.
          String literal much more faster
         */

        System.out.println("========== Pool Vs Heap ==============");

        String s1 = "Cybertek"; // String pool;
        String s2 = "Cybertek"; // String pool

        //one object was created in the String memory. s1 ans s2 are sharing the same object.
        System.out.println(s1 == s2); //true

        String s3 = new String("Cybertek"); // Heap memory
        String s4 = new String("Cybertek"); // Heap memory

        // String s3 - saved in the Heap memory as a new object. s3 != s1 && s3 != s2.
        //  String s3 and s4 are two different objects created in the Heap memory.
        // line 38 + 39 + 44 + 45 = 3 objects were created

        System.out.println(s3 == s4); // false
        System.out.println(s3 != s4); // true

        System.out.println( s3 == s2); // false
        System.out.println( s3 == s1); // false
        System.out.println( s3 != s1); // true
        System.out.println( s3 != s2); // true

        //Java is a CASE SENSITIVE language.

        String s5 = "cybertek"; // String pool

        System.out.println( s5 == s1); // false
        System.out.println(s5 == s3); // false









    }
}
