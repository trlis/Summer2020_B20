package day27_recap;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

       /*
        for each loop:

        We MUST have a Data structure in order to use it

        iterates 0 - length-1 (fixed, cant change)

        for(DataType name: Collection of Data){
        satements}

        dataType must Match with the collection of Data

        When to use:
        When we don't need to provide index numbers

        */

        int[] arr = {1, 2, 3, 4, 5};

        for (int each : arr){ //each is an element not an index. each has a value that it represents

            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("=========================================");

        int[] arr1 = {1, 2, 3, 4, 5};

        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("=========================================");

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        int countDivisBy3 = 0;
        for(int each : scores){
            if(each%3 !=0){
                continue;
            }
            countDivisBy3++;
            System.out.print(each + " ");
            System.out.println(countDivisBy3);
        }

        System.out.println();
        System.out.println("=========================================");

        String[] names = {"AB", "ABC", "A", "AB", "ABCD"};

        for( String each : names){
           if(!each.contains("C")){
               continue;
           }
            System.out.print(each + " ");
        }

        System.out.println();
        System.out.println("=========================================");



        int[] score ={80, 75, 65, 110, 90, 45, 56, 78};
        int maxNum = score[0];
        int minNum = score[0];

        for(int each : score) {
            if (each > maxNum) {
                maxNum = each;

            }
            if (each < minNum) {
                minNum = each;

            }
        }
            System.out.println(maxNum);
            System.out.println(minNum);


        }

        }

