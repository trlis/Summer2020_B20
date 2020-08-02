package day07_unary_shortHand;

public class unaryOperators {

    public static void main(String[] args) {

        System.out.println(- 1 + -10);
        System.out.println(-1 - 10);

        //--:
        int a = 20;
        --a;
        System.out.println(a);

        //+;
        int b = 10;

        System.out.println(++b);
        System.out.println(--b);

        //pre-increment: increases or decreases the value by 1 immediately

        int z = 80;
        System.out.println( ++z ); // z = 81
        System.out.println( --z );  // z = 80

        //post increment:
        // first passes the current value, then next step increases/decreases value by 1

        int t = 100;
        System.out.println( t++);
        System.out.println(t--);
        System.out.println(t--);


    }
}
