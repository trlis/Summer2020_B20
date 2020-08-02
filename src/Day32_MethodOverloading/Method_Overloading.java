package Day32_MethodOverloading;

public class Method_Overloading {
    /*
    concept of multiple methods having the same method name
    pre condition: all the parameters MUST be different(either dataType or number of parameters)

    advantages:
            - easy to read
            - easy to remember
            - reusable
            -flexible
    */


    public static void main(String[] args) {

        addition2Numbers(10,20);
        addition3Numbers(10,20,30);
        addition4Numbers(10,20,30,40);
        System.out.println("=============================");

        addition(10,20);
        addition(10,20,30);
        addition(10,20,30,40);



        /*

        1.create a method that can find he addition of two numbers addition2Numbers
        2.create a method that can find he addition of tree numbers addition3Numbers
        3.create a method that can find he addition of four numbers addition4Numbers
         */
    }

    public static void addition2Numbers(double a, double b) {
        System.out.println(a + b);
    }

    public static void addition3Numbers(double a, double b, double c) {
        System.out.println(a + b + c);
    }

    public static void addition4Numbers(double a, double b, double c, double d) {
        System.out.println(a + b + c + d);
    }
    //=================================================================================

    public static void addition(double a, double b) {
        System.out.println(a + b);
    }

    public static void addition(double a, double b, double c) {
        System.out.println(a + b + c);
    }

    public static void addition(double a, double b, double c, double d) {
        System.out.println(a + b + c + d);
    }
}
