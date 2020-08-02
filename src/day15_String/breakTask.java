package day15_String;
import java.util.Scanner;


public class breakTask {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the first string ");
        String first = scan.nextLine();
        int firstString = first.length();

        System.out.println("Enter the second string ");
        String second = scan.nextLine();
        int secondString = second.length();

        if (firstString > secondString){
            System.out.println(first);
        }else{
            System.out.println(second);
        }





    }
}
