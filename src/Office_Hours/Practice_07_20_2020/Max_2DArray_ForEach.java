package Office_Hours.Practice_07_20_2020;

public class Max_2DArray_ForEach {
    public static void main(String[] args) {
        /*
          write a program that can find the maximum number from any given two dimensional array

         */

       int[][] arr2D ={{1,2,3},{4,5,6,7},{8,9,10,11,12},{-20,55,0}} ;


       int max = arr2D[0][0];


       for(int[] arr1D: arr2D ){
           for(int eachNum: arr1D){
               if(eachNum>max){
                   max = eachNum;
               }
           }
           }
        System.out.println(max);

       }
    }
