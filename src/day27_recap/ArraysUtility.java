package day27_recap;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        /*
        sort():
        toString(): returns a String
        equals():
         */


       // sort():  sorts elements of an array in ascendant order/
        String[] names = {"Odina", "Lilia", "Berk", "Emine"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        int[] score ={80, 75, 65, 110, 90, 45, 56, 78};
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        System.out.println("Max number: " + score[score.length-1]);
        System.out.println("Min number: " + score[0]);

        System.out.println("========== equals():==========");

       // equals(): structure: Arrays.equals(array1, array2)

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "B", "C"};
        String[] s3 = {"C", "A", "B"};

        System.out.println(Arrays.equals(s1, s2)); // returns boolean(true/false) ==> true
        System.out.println(Arrays.equals(s1, s3)); //false

        String[] a1 = {"A", "C", "B"};
        String[] a2 = {"B", "A", "C"};
        System.out.println(Arrays.equals(a1, a2)); //false
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.equals(a1, a2)); //true



    }
}
