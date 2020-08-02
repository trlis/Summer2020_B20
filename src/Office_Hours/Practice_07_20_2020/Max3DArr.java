package Office_Hours.Practice_07_20_2020;

public class Max3DArr {
    public static void main(String[] args) {


         /*
          write a program that can find the maximum number from any given two dimensional array

         */

        int[][][] arr3D ={ { {1,2,3}, {4,5,6} },{{6,7},{8,9,10} } };


        int max = arr3D[0][0][0];

        for(int[][] arr2D: arr3D){
            for(int[] arr1D: arr2D){
                for(int eachNum : arr1D){
                    if(eachNum>max){
                        max= eachNum;
                    }
                }
            }
        }
        System.out.println(max);

    }
}
