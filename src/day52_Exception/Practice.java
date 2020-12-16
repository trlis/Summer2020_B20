package day52_Exception;

public class Practice {
    public static void main(String[] args) {

        //System.out.println(9/0);

        //System.out.println("Test completed"); // can not be executed because of the Exception
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day52_Exception.main.main(main.java:6)

         */

        try {
            System.out.println(9 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }

            System.out.println("test completed");
        }
}
