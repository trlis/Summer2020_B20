package day28_Recap;

import java.util.Arrays;

public class MultiD_Arrays {
    public static void main(String[] args) {

        /*
        single dimensional array:
        int[] arr = {1, 2, 3, 4}
                [index of elements]

         Arrays.toString() - for single D arrays only,
                             do not needed for elements

        multi-dimensional array: contains multiple arrays
              ________________________________________________________
              |  n dimensional array contains (n-1)dimensional array |
              |  2D array: contains 1D array                         |
              |  [index of 1D array][index of elements]              |
              --------------------------------------------------------

         */

        int[] arr1D = {1,2,3};
        int[][] arr2D = {{1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}};
        //               idx:0       idx:1          idx:2

        //1D array
        System.out.println(Arrays.toString(arr2D[1])); //{4,5,6,7,8}

        //Multi-D array
        System.out.println(Arrays.deepToString(arr2D)); //[[1, 2, 3], [4, 5, 6, 7, 8], [9, 10, 11, 12, 13]]

        //Element
        System.out.println(arr2D[1][3]);//7

        System.out.println("======= even ELEMENTS FROM MULTI-D ARRAY===================");


        int[][] arr = {{1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}};
        //               idx:0       idx:1          idx:2

        for(int i = 0; i<= arr.length-1; i++) {
            //outer loop is responsible for retrieving each 1D array from arr

            int[] each1DArr = arr[i]; // returns all the int arrays

            for (int j = 0; j <= each1DArr.length - 1; j++) {
                // inner loop is responsible for retrieving each element from each array

                int eachNum = each1DArr[j];
                if(eachNum%2 == 0);
                System.out.print(eachNum + " ");

            }
            System.out.println(); // to print elements of each array on line by line
        }
            System.out.println("======= odd ELEMENTS FROM MULTI-D ARRAY  =================");


            int[][] arr2d = {{1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}};
            //               idx:0       idx:1          idx:2

            for(int[]each1D : arr2d){

               for(int eachElem : each1D){
                   if(eachElem%2 != 0) {
                       System.out.print(eachElem + " ");

                   }
               }
                System.out.println();
            }








    }

}
