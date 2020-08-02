package day13_Scanner;
import java.util.Scanner;
public class WarmUp_RectangleArea {
    public static void main(String[] args) {


        /*
          2. write a program that calculate the area of any given rectangle
                MUST use scanner
         */
        System.out.println("========== Rectangle Area ============");

        //A = a * b

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width: ");

        int width = input.nextInt();

        System.out.println("Enter the length: ");

        int length = input.nextInt();

        System.out.println("Area of the rectangle is: " + (width*length));


    }
}
