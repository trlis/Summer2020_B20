package day33_LocalDateTime;

import java.util.Arrays;

public class Calculate {
    /*
    Task01:
        1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals
        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals

        Pre condition of overloading is having different parameters or number of parameters or names of the parameters.
     */
    public static void main(String[] args) {

        int a =10;
        double b =20;
        System.out.println(addition(a, (int)b));

        float num1 =10.5f;
        float num2 = 10;

        System.out.println(addition((int)num1, (int)num2));

        System.out.println(addition(90, 5.5));

        System.out.println(addition(10,30));
        System.out.println(addition(0.5, 2));

        int[] arr = {4,3,2,1};
        Arrays.sort(arr);

        char[] arr1 = {'C', 'B', 'A'};


        long l1 = 100;
        long l2 =200;

        System.out.println(multiplication((int)l1, (int)l2));



    }

    public static int addition(int a, int b){
        return a+b;
    }

    public static double addition(double a, double b){
        return a+b;
    }
    public static double addition(double a, int b){
        return a+b;
    }

    public  static int multiplication(int a, int b){
        return a*b;
    }


    public  static double multiplication(double a, double b){
        return a*b;
    }

}

