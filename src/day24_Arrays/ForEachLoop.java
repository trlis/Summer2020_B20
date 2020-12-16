package day24_Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        /*

        Data Structures:

        1.Array
        2.Collection
        3.Map
   for loop:

   int[] arr = {1,2,3}
   for(int i =0, i<= arr.length-1, i++) {
   }

   for each loop :

                for(DataType, each - preferred variable name: Collection of Data){
                }
               => variable "each" represents every single element in the Collection

                loop that's already iterated. starting from index 0 till the end of the data structure
                order is fixed
                we MUST have a data structure  to use for each loop

                Data Type: MUST match with the Array's dataType



         */
        int[] arr = {1,2,3,4,5,6,7,8,9,-1,-2,-3};

        for(int i=0; i<=arr.length-1 ; i++){ // i is the index number

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("==============================");

        int[] arr1 = {1,2,3,4,5,6,7,8,9,-1,-2,-3};

        for(int each: arr1 ){ // each represents the elements from the Data Structure
            System.out.print(each + " ");
        }
        System.out.println();

        System.out.println("==============================");

        String[] classmates = {"Asil", "Andrei", "Kalbinur", "Kevser", "Isa"};

        for(String each : classmates){
            System.out.print(each + " ");
        }









    }
}
