package day29_CustomMethods;
import java.util.Scanner;
public class MethodWithoutParameter2 {
    public static void main(String[] args) {

        printHello5X();
        System.out.println("Cybertek");
        printHello5X();
        System.out.println("Lisa");
        printHello5X();


    }

     /*
    method without the parameter:

        Access-modifier    Specifiers     Return type     name(){
        statements
        }
   */

    public static void printHello5X() {

        for (int i = 10; i > 6; i--) {
            System.out.println("Hello World");

        }

    }
}

