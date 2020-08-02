package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;

public class Array_DescendingOrder {

    public static void main(String[] args) {

        int[] arr = {98, 97, 100, 200, 55, 68, 79};

        Arrays.sort(arr);
        descending(arr);


    }

    public static void descending(int [] arr) {

        int[] descArr = new int[arr.length];
/*
        //     k         i
        descArr[0] = arr[6];
        descArr[1] = arr[5];
        descArr[2] = arr[4];
        descArr[3] = arr[3];
        descArr[5] = arr[2];
        descArr[6] = arr[1];
        descArr[7] = arr[0];
*/
        int k=0;
        for(int i = arr.length -1; i>=0; i++){
            descArr[k] = arr[i];
            k++;

        }

        System.out.println(Arrays.toString(arr));


    }
}