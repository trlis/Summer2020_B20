package day15_String;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your sentence: ");

        String sentence = input.nextLine();

        int lastIndxNum = sentence.length()-1;

        System.out.println( sentence.charAt(0) + "" + sentence.charAt(lastIndxNum));

    }
}
