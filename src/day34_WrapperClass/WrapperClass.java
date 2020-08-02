package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass {

    /*
    Primitives:
 Wrapper Class:   Byte, Short,  Int, Long, Character,  Boolean, Double, Float
                  byte  short   int  long    char      boolean  double  float

    Data Structures:

    1.Array ==> supports primitive, non primitives(String)
    2.Collection ==> doesn't support primitives
    3.Map ==> doesn't support primitives


    Default values:
        primitives:
            byte, short, int, long ==> 0
            double, float ==> 0.0
            boolean ==> false

        Wrapper class ==> null

        "123" ==> 123
        methods:
            parse methods: converts string to primitive
            *parse method ignores sense sensitivity
            valueOf method: converts string of text to wrapper class
     */
    public static void main(String[] args) {

        Integer num = 100;
        int a =100;

        byte t = 100;
        int z = t;

        //Integer z2 = t

        Byte b1 =50;
        int n1 = 50;

        byte b2 = 40;
        //Integer n2 =b2;

        Integer n3 = new Integer (123);
        Double[] a1 = new Double [3];
        System.out.println(Arrays.toString(a1));



        int[]arr = new int[3];
        System.out.println(Arrays.toString(arr));

        int p1 = 300;
        Integer p2 = p1; //Autoboxing ==> Converting primitive to wrapper class
        Integer q1 = 500;
        int q2 = q1; // Unboxing == Converting Wrapper class value to its primitive

        //Double r1 =300; -compiler error //wrapper class is only dedicated to its primitives (300 - is int by default)
        Double r1 = 300.0;
        double r2 = r1; //Unboxing

        long l1 =400;
        Long l2 = l1; //Autoboxing

        Float f1 = 100.5f;
        Float f2 = f1;



    }


}
