package day26_MultiDimentionalArrays;

import java.util.Arrays;

public class MultiDArray_Intro {

    public static void main(String[] args) {



        /*
        Single dimensional array: contains multiple data
             int[] arr1 = {1,2,3}
             arr[0] ==> 1

             int[] arr2 = {4,5}
             int[] arr3 ={6,7,8}

        Multi - Dimensional Arrays: array that contains multiple arrays

            n dimensional array contains (n-1) dimensional array

            2 dimensional array: contains single dimensional array
                 int[][] array2D = {{1,2,3}, {4,5}, {6,7,8}}
                                     idx:0    idx:1   idx:2
                    1-[]  - index of the single dimensional array
                    2-[]  - index of the element from the single dimensional array

                 arr2D[0] ==> {1,2,3}
                 arr2D[1] ==> {4,5}
                 arr2D[2] ==> {6,7,8}

         */

        char[] ch1 = {'A', 'B'};
        char[] ch2 = {'C', 'D', 'E'};
        char[] ch3 = {'F', 'G', 'H'};

        //chars idxs:     0    1     0    1    2      0    1    2
        char[][] ch2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'}};
        //                  idx:0         idx:1           idx:2

        // ch2D[1] - returns a single dimensional array
        // System.out.println(ch2D[1]); if its not a char, the output will be the hash code

        System.out.println(Arrays.toString(ch2D[1]));
        System.out.println(Arrays.toString(ch2D[2]));
        //"Arrays.toString" method used only to print an array
        //To print a single element we don't need to use "Arrays.toString"

        //H
        System.out.println(ch2D[2][2]);

        //C
        System.out.println(ch2D[1][0]);

        // G, B
        System.out.println("" + ch2D[2][1] + "," + ch2D[0][1]);

        System.out.println("=======================================");

        //{1,2,3} , {4} , {5,6} , {7,8,9,10}


        //int[] arr1D = { {1,2,3} }
        int[][] nums = {{1, 2, 3}, {4}, {5, 6}, {7, 8, 9, 10}};
        //              idx:0   idx:1  idx:2  idx:3

        //System.out.println(nums[3]); output: [I@1b6d3586 - hashcode
        System.out.println(Arrays.toString(nums[3]));

       /*
       {1,2,3}
       {4}
       {5,6}
       {7,8,9,10}
        */

        System.out.println("=============For loop=======================");
        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }

            System.out.println("============For each loop========================");

            for (int[] each : nums) {
                System.out.println(Arrays.toString(each));
            }

        System.out.println("============== Arrays.deepToString ====================");
            /*
            Array.toString() : for single-D array/ regular array
            Arrays.deepToString(array): converts multi-D array to string
             */
        int[][] nums2 = {{1, 2, 3}, {4}, {5, 6}, {7, 8, 9, 10}};

        System.out.println(Arrays.deepToString(nums2));

    }
}











