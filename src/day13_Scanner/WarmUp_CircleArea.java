package day13_Scanner;
/*
WarmUp tasks:
    1. write a program that can calculate the area of any given circle
                MUST use Scanner

 */

import java.util.Scanner;
public class WarmUp_CircleArea {
    public static void main(String[] args) {


        System.out.println("======== Circle Area ===========");
        //A= Pr^2 - area of a circle

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");

        double circle = input.nextDouble();
        System.out.println("Area of the circle is: " + (circle * circle) * 3.14);


    }
}
