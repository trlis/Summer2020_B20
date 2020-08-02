package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class Combine2Arrays_ForLoop {
    public static void main(String[] args) {

        char[] arr1 = {'A', 'B', 'C'};
        char[] arr2 = {'D', 'E', 'F'};
        char[] arr3 = new char[arr1.length + arr2.length];

        int index =0;

        for(int i = 0; i<=arr1.length-1; i++){
            arr3[index] = arr1[i];
            index++;

        }
        for(int j=0; j<=arr2.length-1; j++){
            arr3[index] = arr2[j];
            index++;


        }
        System.out.println(Arrays.toString(arr3));



    }
}
