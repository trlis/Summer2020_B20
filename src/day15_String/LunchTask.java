package day15_String;
import java.util.Scanner;

public class LunchTask {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter any sentence:");

        String sentence = input.nextLine();

        char firstChar = sentence.charAt(0);
        int lastIndexNum = sentence.length()-1;
        char lastChar = sentence.charAt(lastIndexNum);
        System.out.println("The sentence starts with " + firstChar + ", and ends with " + lastChar);String str = input.nextLine();

    }
}
