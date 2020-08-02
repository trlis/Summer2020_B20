package day06_primitiveCasting_relationalOperators;

public class implicit_Explicit {
    public static void main(String[] args) {

        short s1 = 100;
        long l1 = s1; // implicit casting: automatically done

        long l2 = (long) s1; //if we will implicit manually

        int i1 = 300;
        double d1 = i1; // 300.0

        System.out.println(d1);

        double d2 = (double) i1;


        //Explicit casting

        double num1 = 100.5;
        int num2 = (int)num1;
        System.out.println(num2);

        long num3 = 4400;
        short num4 = (short) num3;
        System.out.println(num4);

        int n1 = 1000;
        byte b1 = (byte)n1;
        System.out.println(b1); // -24

        double m1 = 34.1;
        float f1 = (byte) m1;
        System.out.println(f1);

        long lon1 = -500;
        int in1 = (int) lon1;
        System.out.println(lon1);


    }
}
