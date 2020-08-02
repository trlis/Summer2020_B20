package Day32_MethodOverloading;

import java.util.Arrays;

/*
 3. write a method that can add element to an array, the method accepts an array and and a number, then returns the new array by appending the number to the last index of the given array
        Ex:
            int[] arr = {1,2,3};
            int num = 4;
            addElement(arr, num); ===> {1,2,3,4}
 */
public class WarmUpTask_AddElement {
    public static void main(String[] args) {

        int[] scores = {85,65,40,55, 95};
        int n1 = 70;
       // addElement(arr, num); ===> {1,2,3,4}

        scores = addElement(scores, n1);
        System.out.println(Arrays.toString(scores));

    }
     public static int[] addElement(int arr[], int num){

         int[] arr2 = new int[arr.length+1];// [0, 0, 0, 0]
         arr2[arr2.length-1] =num; //[arr2.length-1] - index of the last num in the array to assign  "int num =10"(line16)


         int i =0;
         for(int each : arr){
             arr2 [i]= each;
             i++;
         }
         return arr2;


    }


}
