package day33_LocalDateTime;

import java.util.Arrays;

public class SortDescending {
    /*
       Task02:
        1. create a return method that can return an int array in descending order
        2. create a return method that can return a double array in descending order
        3. create a return method that can return a String array in descending order
        4. create a return method that can return a char array in descending order

     */

    public static void main(String[] args) {

        int[] arr = {5, 2, 1, 4, 3, 0};
        System.out.println(Arrays.toString(descending(arr)));

        double[] arr1  ={5.5,1.1,2.2,3.3,4.4};






    }


    public static int[] descending(int[] arr) {
        Arrays.sort(arr);

        int[] arr2 = new int[arr.length - 1];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }

    public static double[] descending(double[] arr){
        Arrays.sort(arr);

        double[] arr2 = new double[arr.length - 1];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }

    public static char[] descending(char[] arr) {
        Arrays.sort(arr);

        char[] arr2 = new char[arr.length - 1];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }
    public static String[] descending(String[] arr) {
        Arrays.sort(arr);

        String[] arr2 = new String[arr.length - 1];

        int k = arr.length - 1;
        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = arr[k];
            k--;

        }
        return arr2;
    }
}
