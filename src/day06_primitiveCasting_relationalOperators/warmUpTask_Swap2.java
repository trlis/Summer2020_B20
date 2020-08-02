package day06_primitiveCasting_relationalOperators;
       /*
task03:
 create a class called Swap, and write a program that can swap two variables' values with using temporary variable
                    Ex:
                        int a =10;
                        int b= 15;
                    output:
                        System.out.println(a); ===> 15
                        System.out.println(b); ===> 10

 */

public class warmUpTask_Swap2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        a = a + b; //a = 25
        b = a - b; //b = 15
        a = a - b; //a = 10

        System.out.println(a);
        System.out.println(b);



    }
}
