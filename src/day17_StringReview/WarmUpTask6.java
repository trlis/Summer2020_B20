package day17_StringReview;
import java.util.Scanner;

/*
6. write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
 */
public class WarmUpTask6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter email");
        String email = input.next();

        int a = email.indexOf("@");
        System.out.println(a);

        int dot = email.lastIndexOf(".");
        System.out.println(a);

       String domain = email.substring(a +1 ,dot);
        System.out.println(domain);












    }
}
