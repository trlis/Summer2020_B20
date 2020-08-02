package day28_Recap;
import java.util.Scanner;
public class Email_NameAndDomain {
    public static void main(String[] args) {
        /*

    3. write a program that can get the name and domain of any given email address
        Ex:
            cybertek@gmail.com
            output:
                name: cybertek
                domain: gmail

         */
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your email");
        String email = input.next();

        String name = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf(".")) ;
        System.out.println("name: " + name);
        System.out.println("domain : " +domain);





    }
}
