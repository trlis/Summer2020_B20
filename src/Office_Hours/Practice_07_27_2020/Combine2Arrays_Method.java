package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class Combine2Arrays_Method {

    public static void main(String[] args) {

        char[] arr1 = {'A', 'B', 'C'};
        char[] arr2 = {'D', 'E', 'F'};
        char[] arr3 = new char[arr1.length + arr2.length];

        arr3 = combineArr(arr1, arr2, arr3);
        System.out.println(Arrays.toString(arr3));

      /*
        arr3[0] = arr1[0];
        arr3[1]= arr1[1];
        arr3[2] = arr1[2];

        arr3[3] =arr2[0];
        arr3[4]= arr2[1];
        arr3[5] = arr2[2];

        int i = 0;
        for (char each : arr1) {//'A', 'B', 'C'
            arr3[i] = each;
            i++;

        }
        for (char each : arr2) {//'D', 'E', 'F'
            arr3[i] = each;
            i++;

        }
        System.out.println(Arrays.toString(arr3));

       */

    }
    public static char[] combineArr(char[]arr1, char[] arr2, char[] arr3){
        int i = 0;
        for (char each : arr1) {//'A', 'B', 'C'
            arr3[i] = each;
            i++;

        }
        for (char each : arr2) {//'D', 'E', 'F'
            arr3[i] = each;
            i++;

        }
        return arr3;


    }


}
