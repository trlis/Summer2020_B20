package day25_Practices;

import java.util.Arrays;

public class warmUpTask6_Combine2Arrays {
    public static void main(String[] args) {
        /*
         6. write a program that can combine two arrays of integers and then print out the maximum number
    Ex:k
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}
        output:
            arr3 = {1,2,3,4,5,6,7,8}
            max: 8
         */

        int[] arr1 ={1, 2, 3, 6, 9};
        int[] arr2 = {4, 5, 2};

        int size = arr1.length + arr2.length; //5
        int[] arr3 = new int[size]; // array contains 5 elements
/*
        arr3[0] = arr1[0];
        arr3[1] =arr1[1];
        arr3[2] =arr1[2];

        arr3[3] =arr2[0];
        arr3[4] =arr2[1];

         //System.out.println(Arrays.toString(arr3));
*/
        int index =0; //

        for(int each : arr1) {
            arr3[index] = each;
            index += 1;
        }

        for( int each :arr2){
            arr3[index] = each;
            index+=1;
        }





        System.out.println(index);
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println("Maximum: ");
        }





    }

