package Office_Hours.StringReverse_ForAndWhileLoops;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine(); // nalan

        String result = ""; //first i declare an empty string to store there the final result //nal

        for(int i= 0; i<=str.length()-1; i ++){

           String s = " "  + str.charAt(i); //s: n, a, l, a, n

            if(result.contains(s)){
                continue;
            }else{
                result+=s;
            }

        }
        System.out.println(result);

    }
}
