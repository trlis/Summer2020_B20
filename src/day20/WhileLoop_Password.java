package day20;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class WhileLoop_Password {

    public static void main(String[] args) {

        String pw = "Cybertek123";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password");
        String input = scan.next();

        while(!input.equals(pw)){
            System.out.println("Please re-enter your password");
            input = scan.next();
        }
        System.out.println("Logged in");






    }
}
