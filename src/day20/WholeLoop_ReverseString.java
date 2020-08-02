package day20;
import java.util.Scanner;
public class WholeLoop_ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine(); // cat 012

        String result = "";
        int index = str.length()-1;
        while (index >= 0) {

            result += str.charAt(index);
            index--;
        }

        System.out.println(result);

        }




}
