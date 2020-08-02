package day03_sequences_variables;

public class Variables_Practice {
    public static void main(String [] args){

        //15000, 100000

        int num1 = 15000;
        int num2 = 100000;
        int sum = num1 + num2;

        System.out.println(sum);

        float num3 = 3.5F;

        double a = num3;
        //long b = num3; long<float - compiler error

        long x = 100;
        float y = x;
        double z = x;

        System.out.println(x); //100
        System.out.println(y); //100.0
        System.out.println(z); //100.0


        float f = 100;
        float f2 = 100.0f;
        System.out.println(f);
        System.out.println(f2);


        //float always returns as a decimal



        System.out.println(10%3);





    }
}
