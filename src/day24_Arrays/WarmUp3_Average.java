package day24;
import java.util.Scanner;
public class WarmUp3_Average {
    public static void main(String[] args) {
        /*
          3. Write a program that can return the average number from an array of integers
            ex: [1,2,3]
            average: 2
            [10, 15, 5, 6]
            average: 9
            [4, 5, 6, 7, 8, 10, 20, 30, 0]
            average: 10
         */

        int[]arr ={1,2,3,4,5,6,7,8,9,10};
        //         0 1 2 3 4 5 6 7 8 9


        int sum = 0;

        for(int i = arr.length-1; i>0; i--){
            sum += arr[i];

            System.out.println("sum: " + sum);

            double average = sum / arr.length;

            System.out.println("Average number: " + average);
        }

    }
}
