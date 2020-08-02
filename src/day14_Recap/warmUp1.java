package day14_Recap;

import java.util.Scanner;
/*
warmup tasks:
        1. write a java program that can convert any given numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
            MUST use Scanner and nested IF



 */
public class warmUp1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a digit: ");

        int num = scan.nextInt();

        if(num >0 && num <9){

           if (num == 1){
               System.out.println("One");
           }else if(num ==2){
               System.out.println("Two");
           }else if( num == 3){
               System.out.println("Three");
           }else if( num == 4){
               System.out.println("Four");
           }else if(num == 5){
               System.out.println("Five");
           }else if(num == 6){
               System.out.println("Six");
           }else if( num == 7){
               System.out.println("Seven");
           }else if (num == 8) {
               System.out.println("Eight");
           }else{
               System.out.println("Nine");
           }

        }else{
            System.out.println("Invalid");
        }
    }
}
