package day08_logicalOperators;

public class ifStatement {
    public static void main(String[] args) {

        int a = 2000;
        int b = 2000;


        if (a > b) {
            System.out.println(a + " is the max number");
        }
        if(a < b) {
            System.out.println(b + " is the max number");
        }
        if (a == b) {
            System.out.println("both are equal");
        }


        System.out.println("=======================");

        boolean breakTime = true;

        if (breakTime == true){
            System.out.println("Take 15 min break");
        }
        if (breakTime != true){
            System.out.println("Keep studying");
        }


        boolean Corona = false;

        if(Corona == true){
            System.out.println("Buy more toilet paper");
            System.out.println("Buy more sanitizer");
            System.out.println("Keep Social Distance");
            System.out.println("Stay at home");
        }
        if (Corona == false)
            System.out.println("Do whatever you want");















    }

}
