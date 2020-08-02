package day29_CustomMethods;
import java.util.Scanner;
/*
   10. write a method that can remove the duplicates from the string
 */
public class Task10_RemoveDuplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str= input.nextLine();

        removeDuplicates(str);

    }
    public static void removeDuplicates(String str){

        String nonDup ="";
        for(String each : str.split("")){

            if(!nonDup.contains(each)){
                nonDup+=each;

            }
        }
        System.out.println(nonDup);





    }

}
