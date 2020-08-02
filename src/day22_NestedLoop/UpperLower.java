package day22_NestedLoop;

import java.util.Scanner;
public class UpperLower {
    public static void main(String[] args) {

        /*
        warmup tasks:
    1. Write a program that asks user to enter a string. If string started with uppercase
     and ends with lowercase letter then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();

        char ch1  = str.charAt(0);
        char ch2 = str.charAt(str.length()-1);

        //Upper Case  A -Z  65-90
        //Lower case  a-z   97-122

        boolean start = ch1 >= 'A' && ch1 <= 'Z';
        boolean end = ch2 >= 'a' && ch2 <= 'z';

        if(start && end){
            System.out.println(true);
        }else{
            System.out.println(false);
        }








        }
}
