package day19_forLoop_BreakStatement;

public class LoopWithoutCurlyBraces {
    public static void main(String[] args) {

        for(int i = 5; i<=10; i++){
            System.out.println("Hello");
            System.out.println("How are you");
        }

        // in the loop without curly braces only repeat one single line statement
        for(int i = 5; i<=10; i++)
            System.out.println("Hello");
            System.out.println("How are you");

    }
}
