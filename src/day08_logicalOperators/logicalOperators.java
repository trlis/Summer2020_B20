package day08_logicalOperators;

public class logicalOperators {

    public static void main(String[] args) {

        // !-opposite boolean

        boolean r1 = 9 > 7; //true

        boolean r2 = !r1; //false

        System.out.println(r1 + " : " + r2);

        System.out.println(!false);
        System.out.println(!true);

        boolean r3 = !false == true;
        System.out.println(r3);

        boolean r4 = true == !true;
        System.out.println(r4);
        System.out.println("=============AND Logic=================");

        boolean r5 = 9>5 && 9>10;
        System.out.println(r5);
        // in order to return "true" both expressions mut be "true". Otherwise it'll return false.

        boolean r6 = !true && false; //false
        System.out.println(r6);
        boolean r7 = !false && 9>8; //true
        System.out.println(r7);

        System.out.println("=============OR Logic=================");

        // ||: or - either one condition or another. If one condition is true then the whole statement is true.

        boolean r8 = true == !false || false == true;
        System.out.println(r8);

        boolean r9 = !false == false || true ==!false;
        System.out.println(r9);


    }
}
