package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethods4 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        int[] arr3 = combinedArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

    }

    public static int[] combinedArrays(int[] arr1, int[] arr2) {

        //{1,2,3}  {4,5,6} ==> {1,2,3,4,5,6}

        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each1 : arr1) {
            arr3[i] = each1;
            i++;
        }
        for (int each2 : arr2) {
            arr3[i] = each2;
            i++;
        }
        return arr3;
    }
}