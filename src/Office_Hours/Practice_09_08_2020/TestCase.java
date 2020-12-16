package Office_Hours.Practice_09_08_2020;

import org.w3c.dom.ls.LSOutput;

public class TestCase {

    public static void main(String[] args) {

        Credentials c1 = new Credentials();
        System.out.println("User name Entered : " + c1.getUserName());

        c1.setUserName("Batch20");
        System.out.println("New user name Entered: " +c1.getUserName());
        System.out.println("User name Entered again: " +c1.getUserName());

        System.out.println("=========================================");

        c1.setPw("JavaTurtles");

        System.out.println("New Password Entered: " +c1.getPw());
        System.out.println("User Password Entered again: " +c1.getPw());



    }

/*
    public String getUserName(){
        return userName;
    }
    */


}
