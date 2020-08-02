package Office_Hours.Practice_07_15_2020;
import java.util.Scanner;
public class JavaFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str =str.toLowerCase(); //javajavajavajavajava

        int count = 0;


        while(str.contains("java")){ //true
            count++;
           str =  str.replaceFirst("java", ""); //removes one "java from the string

        }
        System.out.println(count);


    }
}
