package day34_WrapperClass;

import Library.Util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,4,5,6};
        Integer[] arr2 ={7,8,9};
        Integer[] arr3= Util.combineArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

        Integer max = Util.maxNum(arr3);
        System.out.println(max);

        int min = Util.minNum(arr3);
        System.out.println(min);

        Character[] arrChar = {'A', 'A', 'C', 'B', 'B', 'D'};
       //arrChar = Util.descending(arrChar);
       // System.out.println(Arrays.toString(arrChar));






    }
}
