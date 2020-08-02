package day21_DoWhileLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean result = false;

        while (result){
            System.out.println("Hello world"); //not gonna execute this statement
        }

        System.out.println("=======================");

        do{ //just do it, if its false(wrong) do not do it again
            System.out.println("Hello world");
        }while(result);

        //

    }
}
