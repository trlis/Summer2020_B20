package day26_MultiDimentionalArrays;

import java.util.Arrays;

public class ArraysDescendingOrder {
    public static void main(String[] args) {

        /*
        Task:
        write a program that can sort the array in descending order
            ex:
                arr1: { 10, 11, 8, 9, 12, 5, 15}

                output:
                 arr2: {15, 12, 11, 10, 9, 8, 5}

            NOTE: at the end, you must have an array that contains the descending order of the original array
         */

        int[] arr = {2, 1, 3}; //original array
        Arrays.sort(arr); // sorting an original array in ascending order
        System.out.println(Arrays.toString(arr)); //

        int[] desc =new int[arr.length];// initialize an array in descending order but no values
        int k =2;

        /*
        desc[0] = arr[1];
         desc[1] = arr[2];
          desc[2] = arr[3];

         */

       for(int i = 0; i<=arr.length-1; i++) {
           desc[i] = arr[k];

           k--; // k: 2,1,0

       }

        System.out.println(Arrays.toString(desc)); //i(index): 0, 1, 2




    }

}
