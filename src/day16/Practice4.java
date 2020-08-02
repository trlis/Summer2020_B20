package day16;
import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String first = input.next();

        System.out.println("Enter first word");
        String second = input.next();

        String res = (first.equalsIgnoreCase(second))? "Equal" : "Not equal";

        System.out.println(res);


    }

}
