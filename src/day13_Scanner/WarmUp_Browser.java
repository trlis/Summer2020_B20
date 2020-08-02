package day13_Scanner;

public class WarmUp_Browser {
    public static void main(String[] args) {

        /*

    6. write a program that can display the selected browser
            1.1  declare a String variable called browserName
            1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            1.3. if the browser name does not match with the valid browsers' names,
                    out put should be: Invalid Browser Name

         */

        String browserName = "Chrome";
        switch(browserName){
            //CANT USE : boolean, long, double, float


            case "Chrome":
                System.out.println("Chrome");
                break;

            case "Firefox":
                System.out.println("Firefox");
                break;

            case "Opera":
                System.out.println("Opera");
                break;

            case "Safari":
                System.out.println("Safari");
                break;

            case "Edge":
                System.out.println("Edge");
                break;

            default:
                System.out.println("Invalid Browser Name");


        }


    }
}
