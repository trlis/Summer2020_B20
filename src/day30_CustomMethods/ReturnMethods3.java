package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethods3 {
    public static void main(String[] args) {

     int[] arr={50, 10, 30, 20, 40} ;
     int n = 25;
       int num = maxNum(arr);
        System.out.println(num);
        System.out.println(num>n);
        System.out.println(num<n);


    }
    public static void maxN(int[] arr){
        Arrays.sort(arr);

        int m =arr[arr.length-1];

    }

    public static int maxNum(int[] arr) {
        Arrays.sort(arr);

        int max = arr[arr.length - 1];
        return max;
    }
}
