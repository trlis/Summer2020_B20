package day29_CustomMethods;
import java.util.Scanner;
/*
7. create a method that can reverse any String
 */
public class Task7_ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = input.nextLine();
        reverse(str);

    }

    public static void reverse(String str){

        String result  = "";
        for(int i = str.length()-1; i>=0; i--){
            result+=str.charAt(i);

        }
        System.out.println(result);

    }


}
