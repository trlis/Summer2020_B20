package day28_Recap;

import java.util.Arrays;

public class MultiDArrays_Practice2 {
    public static void main(String[] args) {


        System.out.println("======== Task 1 ============");
        /* 1 task:
           expected output : 9,10,11,12,13
                             4,5,6,7,8
                             1,2,3

         */

        int[][] arr2d = {{1,2,3}, { 4,5,6,7,8}, {9,10,11,12,13}};
        //               idx:0       idx:1          idx:2

        for(int i = arr2d.length-1; i>=0; i--){
            int[] arr1d = arr2d[i];
            for(int j =0; j<=arr1d.length-1; j++ ){

                int eachElement = arr1d[j];
                System.out.print(eachElement + " ");
            }
            System.out.println();
        }

        System.out.println("======== Task 2 ================");

        /*
           2 task:
          expected output :  3,2,1
                             4,5,6,7,8
                             9,10,11,12,13
         */

        int[][] arr2D = {{1,2,3}, { 4,5,6,7,8}, {9,10,11,12,13}};
        //               idx:0       idx:1          idx:2


        for(int k =0; k<= arr2D.length-1; k++){
            int[] arr1D = arr2D[k];
           for(int l =arr1D.length-1; l>= 0; l--){
               int each = arr1D[l];
               System.out.print(each + " ");
           }
            System.out.println();
        }

        System.out.println("======== Task 3 ================");
        /*

          3 task:
          expected output :  13, 12, 11, 10, 9
                             8, 7, 6, 5, 4
                             3, 2, 1

         */

        int[][] arr2Dim = {{1,2,3}, { 4,5,6,7,8}, {9,10,11,12,13}};
        //               idx:0       idx:1          idx:2

        for(int n= arr2Dim.length-1; n >=0; n-- ){
            int[] arr1Dim = arr2Dim[n];
            for(int m =arr1Dim.length-1; m>=0; m-- ){
                int eachEl = arr1Dim[m];
                System.out.print(eachEl + " ");
            }
            System.out.println();
        }




    }
}
