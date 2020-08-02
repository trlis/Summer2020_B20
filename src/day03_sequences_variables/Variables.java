package day03_sequences_variables;
/*
declare variables
            DataType variableName = Data
 */
public class Variables {
    public static void main(String[] args){
        //length: 2; width: 4; area:8

        byte length = 11;
        byte width = 12;
        System.out.println(length*width);

        //140
        //byte num = 140 compiler error

        short num2 = 140;
        System.out.println(num2);

        //40000
        //short salary = 40000 compiler error

        int num3 = 400000;
        System.out.println(num3);

        //9999999999
        //int largeNumber = 9999999999 compiler error

        //long largeNumber = 9999999999; compiler error - int is preferred by the compiler
        //System.out.println(largeNumber);
        //the larger the primitive is- the larger the usage

        long largeNumber = 9999999999l;
        System.out.println(largeNumber);

        int score = 100;
        System.out.println(score);

        //Primitives for the decimal numbers

        //PI = 3.14

        double PI = 3.14;

        //float PI = 3.14 compiler error because compiler takes 3.5 as a double by default

        float Pi = 3.14F;
        float pi = 3.14f;



    }
}
